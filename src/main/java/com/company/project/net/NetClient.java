package com.company.project.net;



import com.squareup.okhttp.*;

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
}
