package com.ssm.simple.demo;

import java.util.concurrent.*;

/**
 * 多线程demo
 *
 * @Author peanutnowing
 * @Date 2019/3/18
 */
public final class ThreadPoolDemo {

    private static final int queueSize = 50000;

    private static final int corePoolSize = 8;

    private static final int maximumPoolSize = 8;

    private static final int keepAliveTime = 8;

    private static final BlockingQueue<Runnable> queue = new LinkedBlockingQueue<Runnable>(queueSize);

    private static final ThreadPoolExecutor executor = new ThreadPoolExecutor(
            corePoolSize, maximumPoolSize, keepAliveTime, TimeUnit.SECONDS,
            queue, new ThreadPoolExecutor.AbortPolicy());

    public static void executor(Runnable command) {
        executor.execute(command);
    }

    public static void main(String[] args) {

        ThreadPoolExecutor pool = new ThreadPoolExecutor(2, 2, 0L,
                TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<>(10),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());

        for (int i = 0; i < 20; i++) {
            int index = i;
            pool.submit(() -> System.out.println("i:" + index +
                    " executorService"));
        }
        pool.shutdown();
    }
}
