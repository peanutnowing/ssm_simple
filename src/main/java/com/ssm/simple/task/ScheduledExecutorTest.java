package com.ssm.simple.task;

import org.junit.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * ScheduledExecutor完成定时任务
 *
 * @Author peanutnowing
 * @Date 2019/6/15
 */
public class ScheduledExecutorTest {
    protected static ScheduledExecutorService scheduledThreadPoolForMedal = Executors.newSingleThreadScheduledExecutor();

    /**
     * ScheduledExecutor实现定时任务，每隔60S执行1次
     */
    @Test
    public void excuteTask(){
        LocalDateTime ldtStart = LocalDateTime.parse("2019-06-19T10:13:00");
//        LocalDateTime ldt = LocalDateTime.now().plusDays(1).withHour(15).withMinute(0).withSecond(0);
        Duration initDelay = Duration.between(LocalDateTime.now(), ldtStart);
        scheduledThreadPoolForMedal.scheduleAtFixedRate(() -> {
            try {
                System.out.println("定时任务开始了");
            } catch (Exception e) {
                System.out.println("出错了");
            }
        }, initDelay.getSeconds(), 60, TimeUnit.SECONDS);

    }

}

