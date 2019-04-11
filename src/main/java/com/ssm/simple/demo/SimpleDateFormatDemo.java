package com.ssm.simple.demo;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * SimpleDateFormat的正确用法
 *
 * @Author peanutnowing
 * @Date 2019/4/10
 */
public class SimpleDateFormatDemo {

    private static ThreadLocal<DateFormat> threadLocal = new ThreadLocal<DateFormat>(){
        @Override
        protected DateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        }
    };

    public static String formatDate(Date date) throws ParseException {
        return threadLocal.get().format(date);
    }

    public static Date parse(String strDate) throws ParseException {
       return threadLocal.get().parse(strDate);
    }

    public static void main(String[] args) throws InterruptedException, ParseException {

        ExecutorService service = Executors.newFixedThreadPool(100);

        for (int i = 0; i < 10; i++) {
            service.execute(() -> {
                for (int j = 0; j < 5; j++) {
                    try {
                        System.out.println(parse("2019-04-10 16:30:59"));
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
        // 等待上述的线程执行完
        service.shutdown();
        service.awaitTermination(1, TimeUnit.DAYS);

    }
}
