package com.ssm.simple.demo.thread;

import org.junit.Test;

import java.util.concurrent.CountDownLatch;

/**
 * CountDownLatch用法
 *
 * @Author peanutnowing
 * @Date 2019/3/19
 */
public class CountDownLatchDemo {

    private  static final int THREAD_NUMBER = 10;

    private  static CountDownLatch countDownLatch = new CountDownLatch(THREAD_NUMBER);

    @Test
    public void countDownLatchTest() throws InterruptedException {
        for (int i = 1; i <=THREAD_NUMBER; i++) {
            int index = i;
            new Thread(()->{
                System.out.println("第"+ index +"个选手已经准备好");
                //每一个线程执行后都需要执行countDown()
                countDownLatch.countDown();
            }).start();
        }
        //10个选手（线程）都准备好后，执行await后边的代码
        countDownLatch.await();
        System.out.println("所有选手都已经准备好，比赛开始！");
    }

}
