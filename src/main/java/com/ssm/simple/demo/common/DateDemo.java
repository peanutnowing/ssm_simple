package com.ssm.simple.demo.common;
import com.ssm.simple.utils.DateUtils;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;

/**
 * 日期demo
 *
 * @Author peanutnowing
 * @Date 2019/4/30
 */
public class DateDemo {

    @Test
    public void localTimeTest(){
        LocalTime localTime = LocalTime.parse("00:30:00");
        LocalTime localTimeNew = localTime.plusMinutes(10L);
        System.out.println(localTimeNew);
    }

    /**
     * 当前时间距离凌晨零点的秒数
     */
    @Test
    public void getSecondsToMidnightTest(){
        Long time = DateUtils.getSecondsToMidnight();
        System.out.println(time);
        //日时分秒的格式
        String timeStr = DateUtils.secondsToTime(time/1000);
        System.out.println(timeStr);
    }

    /**
     * 判断一个时间是否在两个时间之间
     */
    @Test
    public void isBetweenTwoTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("HHmm");
        String date = sdf.format(new Date());
        System.out.println(date);
        int time = Integer.parseInt(date);
        if (time >=900 && time <=2100) {
            System.out.println("在这个时间段内");
        } else {
            System.out.println("不在这个时间段内");
        }
    }

}
