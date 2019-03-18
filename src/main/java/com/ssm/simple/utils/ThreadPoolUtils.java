package com.ssm.simple.utils;

import java.util.concurrent.*;

/**
 * 多线程工具类
 *
 * @Author peanutnowing
 * @Date 2019/3/18
 */
public final class ThreadPoolUtils {

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

}
