package com.ssm.simple.task;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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

    public static void main(String[] args) throws ParseException {
        long initDelay = getTimeMills("18:38:00")-System.currentTimeMillis();
        scheduledThreadPoolForMedal.scheduleAtFixedRate(() -> {
            try {
                System.out.println("定时任务开始了");
            } catch (Exception e) {
                System.out.println("出错了");
            }
        }, initDelay, 60*60*24, TimeUnit.MILLISECONDS);
    }

    private static long getTimeMills(String time)   {
        DateFormat dateFormat = new SimpleDateFormat("yy-MM-dd HH:mm:ss");
        DateFormat dayFormat = new SimpleDateFormat("yy-MM-dd");
        Date curDate = null;
        try {
            curDate = dateFormat.parse(dayFormat.format(new Date())+" "+time);
            return curDate.getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return 0;
    }
}

