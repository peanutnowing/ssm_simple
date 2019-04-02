package com.ssm.simple.demo;

import sun.security.krb5.internal.PAForUserEnc;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * Semaphore用法
 *
 * @Author peanutnowing
 * @Date 2019/4/2
 */
public class SemaphoreDemo {

    private static final int THREAD_COUNT = 30;

    private static ExecutorService executorService = Executors.newFixedThreadPool(THREAD_COUNT);

    private static Semaphore semaphore = new Semaphore(10);

    public static void main(String[] args) {
        for (int i=0;i<THREAD_COUNT;i++){
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        //获取许可证
                        semaphore.acquire();
                        System.out.println("do something");
                        //归还许可证
                        semaphore.release();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            });
        }
        executorService.shutdown();
    }


}
