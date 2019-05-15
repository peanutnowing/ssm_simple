package com.ssm.simple.demo.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * FutureTask使用demo
 *
 * @Author peanutnowing
 * @Date 2019/4/16
 */
public class FutureTaskDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<Integer> callable = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                Integer result = 0;
                for (int i=0;i<=100;i++){
                    result=result+i;
                }
                System.out.println("正在计算结果...");
                Thread.sleep(3000);
                return result;
            }
        };
        FutureTask<Integer> future = new FutureTask<>(callable);
        new Thread(future).start();
        System.out.println("先做其它事情...");
        System.out.println("拿到计算结果:"+future.get());
    }
}



