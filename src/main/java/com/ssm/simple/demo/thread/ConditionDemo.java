package com.ssm.simple.demo.thread;

import org.junit.Test;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Condition与Lock配合来实现等待/通知模式
 *
 * @Author peanutnowing
 * @Date 2019/5/23
 */
public class ConditionDemo {

    private Lock lock = new ReentrantLock();

    private Condition condition = lock.newCondition();

    public void await(){
        try {
            lock.lock();
            System.out.println("await time：" + System.currentTimeMillis());
            condition.await();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void signal(){
        try{
            lock.lock();
            System.out.println("signal time：" + System.currentTimeMillis());
            condition.signal();
        }finally {
            lock.unlock();
        }

    }
}
