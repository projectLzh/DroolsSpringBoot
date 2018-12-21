package com.droolsBoot.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StringJointUtil {
    private final static SimpleDateFormat sdfOne = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private final static SimpleDateFormat sdfTwo = new SimpleDateFormat("yyyy-MM");
    private final static SimpleDateFormat sdfThree = new SimpleDateFormat("yyyyMMdd");

    /**
     * 日期转换
     * @param date
     * @return
     */
    public static String dateToString(Date date){
        String dateString = sdfOne.format(date);
        return dateString;
    }

    /**
     * 日期转换
     * @param date
     * @return
     */
    public static String dateToStringTwo(Date date){
        String dateString = sdfTwo.format(date);
        return dateString;
    }

    /**
     * 日期转换
     * @param date
     * @return
     */
    public static String dateToStringThree(Date date){
        String dateString = sdfThree.format(date);
        return dateString;
    }
}
