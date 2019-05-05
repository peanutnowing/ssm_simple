package com.ssm.simple.demo;

import java.time.LocalTime;

/**
 * 日期demo
 *
 * @Author peanutnowing
 * @Date 2019/4/30
 */
public class DateDemo {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.parse("00:30:00");
        LocalTime localTimeNew = localTime.plusMinutes(10L);
        System.out.println(localTimeNew);

    }
}
