package com.ssm.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    /**
     * Date转换时间字符串
     * @param date
     * @param str
     * @return
     */
   public static String dateToStr(Date date,String str){
       SimpleDateFormat sd = new SimpleDateFormat(str);
       String format = sd.format(date);
       return format;
   }

    /**
     * String转换成Data
     * @param str
     * @param dataStr
     * @return
     * @throws ParseException
     */
   public static Date strToDate(String str,String dataStr) throws ParseException {
       SimpleDateFormat sd = new SimpleDateFormat(str);
       Date parse = sd.parse(dataStr);
       return parse;

   }
}
