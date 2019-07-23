package com.ssm.simple.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * XXXX
 *
 * @Author peanutnowing
 * @Date 2019/7/22
 */
public class DateDemo {
    private static final long ONE_MINUTE = 60000L;

    private static final long ONE_HOUR = 3600000L;

    private static final long ONE_DAY = 86400000L;

    private static final long ONE_WEEK = 604800000L;


    private static final String ONE_SECOND_AGO = "秒前";

    private static final String ONE_MINUTE_AGO = "分钟前";

    private static final String ONE_HOUR_AGO = "小时前";

    private static final String ONE_DAY_AGO = "天前";

    private static final String ONE_MONTH_AGO = "月前";

    private static final String ONE_YEAR_AGO = "年前";



    public static void main(String[] args) throws ParseException {

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:m:s");

        Long date = format.parse("2019-04-21 11:35:35").getTime();

        System.out.println(formatDate(date));

    }


    /**
     *  给日期转换样式
     * @param date 日期（毫秒）
     * @return
     */
    public static String formatDate(Long date) {
        long time = new Date().getTime() - date;
        if (time < 1L * ONE_MINUTE) {
            long seconds = toSeconds(time);
            return (seconds <= 0 ? 1 : seconds) + ONE_SECOND_AGO;
        }else if (time < 60L * ONE_MINUTE) {
            long minutes = toMinutes(time);
            return (minutes <= 0 ? 1 : minutes) + ONE_MINUTE_AGO;
        }else if (time < 24L * ONE_HOUR) {
            long hours = toHours(time);
            return (hours <= 0 ? 1 : hours) + ONE_HOUR_AGO;
        } else if (time < 15L * ONE_DAY) {
            long days = toDays(time);
            return (days <= 0 ? 1 : days) + ONE_DAY_AGO;
        }else if (time < 52L * ONE_WEEK) {
            long months = toMonths(time);
            return (months <= 0 ? 1 : months) + ONE_MONTH_AGO;
        } else {
            long years = toYears(time);
            return (years <= 0 ? 1 : years) + ONE_YEAR_AGO;
        }
    }

    /**
     * 将秒数转换为日时分秒的格式
     * @param seconds
     * @return
     */
    public static String secondsToTime(long seconds){
        long days = seconds / 86400; //先转换天数
        seconds = seconds % 86400; //计算剩余秒数
        long hours = seconds / 3600;//再转换小时
        seconds = seconds % 3600;  //计算剩余秒数
        long minutes = seconds /60; //转换分钟
        seconds = seconds % 60;  //计算剩余秒数
        if(days>0){
            return days + "天" + hours + "小时" + minutes + "分" + seconds + "秒";
        }else{
            return hours + "小时" + minutes + "分" + seconds + "秒";
        }
    }
    private static long toSeconds(long date) {
        return date / 1000L;
    }


    private static long toMinutes(long date) {
        return toSeconds(date) / 60L;
    }


    private static long toHours(long date) {
        return toMinutes(date) / 60L;
    }

    private static long toDays(long date) {
        return toHours(date) / 24L;
    }

    private static long toMonths(long date) {
        return toDays(date) / 30L;
    }

    private static long toYears(long date) {
        return toMonths(date) / 365L;
    }

}
