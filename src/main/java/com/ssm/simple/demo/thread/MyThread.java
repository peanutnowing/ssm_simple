package com.ssm.simple.demo.thread;

/**
 * MyThread
 *
 * @Author peanutnowing
 * @Date 2019/5/23
 */
public class MyThread extends Thread{

    private MyService service;

    public MyThread(MyService service) {
        this.service = service;
    }

    @Override
    public void run(){
        service.await();
    }
}
