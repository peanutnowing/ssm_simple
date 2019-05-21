package com.ssm.simple.demo.common;
import com.ssm.simple.utils.DateUtil;
import org.junit.Test;

import java.time.LocalTime;

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
        Long time = DateUtil.getSecondsToMidnight();
        System.out.println(time);
        //日时分秒的格式
        String timeStr = DateUtil.secondsToTime(time/1000);
        System.out.println(timeStr);
    }


}
