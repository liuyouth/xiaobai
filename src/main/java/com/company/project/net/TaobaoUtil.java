package com.company.project.net;

import com.company.project.model.net.ExtraData;
import com.google.gson.Gson;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by liubo on 17/11/9.
 */
public class TaobaoUtil {
    private Gson gson = new Gson();
    public String getImg(String html) {
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
                }
            }

            ExtraData extraData = gson.fromJson(map.get("extraData").toString(), ExtraData.class);
            System.out.println(extraData.getPic());
            return "http:"+extraData.getPic();
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
        return "";
    }
}
