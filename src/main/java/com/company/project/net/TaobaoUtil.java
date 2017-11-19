package com.company.project.net;

import com.company.project.model.Upin;
import com.company.project.model.net.ExtraData;
import com.google.gson.Gson;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by liubo on 17/11/9.
 */
public class TaobaoUtil {
    private Gson gson = new Gson();
    public Upin getImg(Upin upin, String html) {
        /*用來封裝要保存的参数*/
        Map<String, Object> map = new HashMap<String, Object>();
        Document doc = Jsoup.parse(html);
        if (doc!=null){
            Elements e = doc.getElementsByTag("script");
            /*循环遍历script下面的JS变量*/
            for (Element element : e) {

			/*取得JS变量数组*/
                String[] data = element.data().toString().split("var");

			/*取得单个JS变量*/
                for(String variable : data){

				/*过滤variable为空的数据*/
                    if(variable.contains("=")){

					/*取到满足条件的JS变量*/
                        if(variable.contains("extraData")){

                            String[]  kvp = variable.split("=");

						/*取得JS变量存入map*/
                            if(!map.containsKey(kvp[0].trim()))
                                map.put(kvp[0].trim(), kvp[1].trim().substring(0, kvp[1].trim().length()-1).toString());
                        }
                    }
                    /*取到满足条件的JS变量*/
                    if(variable.contains("url")){

                        String[]  kvp = variable.split("'");

						/*取得JS变量存入map*/
                        if(!map.containsKey(kvp[1].trim()))
                            map.put("url", kvp[1].trim().substring(0, kvp[1].trim().length()-1).toString());
                    }

                }
            }
            upin.setFuligou(map.get("url").toString());
            ExtraData extraData = gson.fromJson(map.get("extraData").toString(), ExtraData.class);
            System.out.println(extraData);
            upin.setTitle(extraData.getTitle());
            upin.setImg("http:"+extraData.getPic());
            return upin;
//        Element element = doc.getElementById("J_ImgBooth");
//        if (element!=null) {
//            String img = element.attr("src");
//            if (img!=null){
//                System.out.println(img);
//                return img;
//            }
//        }
//        J_ImgBooth
        }
        return upin;
    }

    public Upin getFuligou(Upin upin, String d) {
              /*用來封裝要保存的参数*/
        Map<String, Object> map = new HashMap<String, Object>();
//        Document doc = Jsoup.parse(d);
//        if (doc!=null){
//
//        }

        String regex1 = " <span class=\"coupons-price\"><strong>¥</strong>(.*?)</span>";
        Pattern pattern1 = Pattern.compile(regex1);
        Matcher m1 = pattern1.matcher(d);
        int countAll1 = m1.groupCount();//
        while (m1.find()){
////                for (int i = 0; i < countAll; i++) {
////                    System.out.println(m.group(i));
////                    url = url+m.group(i);
////                    upin.setUrl(url);
////                }
            if (countAll1>0) {
                System.out.println(m1.group(0));
//                upin.setDiscountAmount(m1.group(0));
            } else {
                System.out.println("非法网址");
            }
        }

        return upin;
    }
}
