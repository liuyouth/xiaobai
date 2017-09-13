package com.company.project.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by liubo on 17/9/14.
 */
public class DateUtils {
    public static String getDate(){
        return dateToString(new Date());
    }
    public static String dateToString(Date time){
        SimpleDateFormat formatter;
        formatter = new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss");
        String ctime = formatter.format(time);
        return ctime;
    }
}
