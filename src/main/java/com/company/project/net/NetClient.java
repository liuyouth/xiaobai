package com.company.project.net;


import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.NicelyResynchronizingAjaxController;
import com.gargoylesoftware.htmlunit.SilentCssErrorHandler;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.DomElement;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.squareup.okhttp.*;
import org.apache.commons.lang3.StringUtils;
import org.w3c.dom.Document;
import sun.tools.jconsole.HTMLPane;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created by liubo on 17/11/9.
 */
public class NetClient {

    OkHttpClient client = new OkHttpClient();

//    public static void main(String[] args) throws IOException {
//
//        OkHttpClient client = new OkHttpClient();
//        RequestBody formBody = new FormEncodingBuilder()
//                .add("phoneno", "18548914868")
//                .add("actKey", "rL7pr88jeokpu8ywOWJixw==")
//                .add("from", "CL")
//                .add("src", "quanmama")
//                .build();
//        Request request = new Request.Builder()
//                .url("https://m.mobike.com/api/v2/usermgr/partnersendcouponV2.do")
//                .post(formBody)
//                .build();
//
//        Response response = client.newCall(request).execute();
//        if (!response.isSuccessful()) {
//            throw new IOException("服务器端错误: " + response);
//        }
//
//        Headers responseHeaders = response.headers();
//        for (int i = 0; i < responseHeaders.size(); i++) {
//            System.out.println(responseHeaders.name(i) + ": " + responseHeaders.value(i));
//        }
//
//        System.out.println(response.body().string());
//    }

    public static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");

    public String post(String url) throws IOException {

//        RequestBody body = RequestBody.create(JSON, json);
        RequestBody formBody = new FormEncodingBuilder()
                .build();
        Request request = new Request.Builder()
                .url(url)
                .post(formBody)
                .build();
        Response response = client.newCall(request).execute();
        if (response.isSuccessful()) {
            return response.body().string();
        } else {
            throw new IOException("Unexpected code " + response);
        }
    }

    public String get(String url) throws IOException {
        Request request = new Request.Builder().url(url).build();
        Response response = client.newCall(request).execute();
        if (response.isSuccessful()) {
            return response.body().string();
        } else {
            throw new IOException("Unexpected code " + response);
        }

    }

    public WebClient webClient;

    public NetClient initWebClient() {
        webClient = new WebClient(BrowserVersion.CHROME);
        webClient.setCssErrorHandler(new SilentCssErrorHandler());
        webClient.setAjaxController(new NicelyResynchronizingAjaxController());
        webClient.getOptions().setActiveXNative(false);
        webClient.getOptions().setUseInsecureSSL(true);//支持https
        webClient.getOptions().setJavaScriptEnabled(true); // 启用JS解释器，默认为true
        webClient.getOptions().setCssEnabled(true); // 禁用css支持
        webClient.getOptions().setThrowExceptionOnScriptError(false); // js运行错误时，是否抛出异常
        webClient.getOptions().setTimeout(10000); // 设置连接超时时间 ，这里是10S。如果为0，则无限期等待
        webClient.getOptions().setDoNotTrackEnabled(false);
        webClient.setJavaScriptTimeout(8000);//设置js运行超时时间
        webClient.waitForBackgroundJavaScript(600 * 1000);//设置页面等待js响应时间,

        return this;
    }

    public String getForWeb(String url) throws IOException, InterruptedException {
        final HtmlPage page = webClient.getPage(url);
        webClient.waitForBackgroundJavaScript(3000);
        webClient.setJavaScriptTimeout(0);
//        Thread.sleep(30000);//主要是这个线程的等待 因为js加载也是需要时间的
        System.out.println("线程结束沉睡");
        String html = page.asXml();
        System.out.println(html);
        System.out.println("\n wwwww" + page.asText());
        DomElement document = page.getElementById("J_root");
        System.out.println(document.getChildElementCount());
        return document.toString();
    }


    public static String getIp2(HttpServletRequest request) {
        String ip = request.getHeader("X-Forwarded-For");
        if (StringUtils.isNotEmpty(ip) && !"unKnown".equalsIgnoreCase(ip)) {
            //多次反向代理后会有多个ip值，第一个ip才是真实ip
            int index = ip.indexOf(",");
            if (index != -1) {
                return ip.substring(0, index);
            } else {
                return ip;
            }
        }
        ip = request.getHeader("X-Real-IP");
        if (StringUtils.isNotEmpty(ip) && !"unKnown".equalsIgnoreCase(ip)) {
            return ip;
        }
        return request.getRemoteAddr();
    }
}
