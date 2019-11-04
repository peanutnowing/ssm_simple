package com.ssm.simple.demo.guava;

import com.google.common.util.concurrent.RateLimiter;

import java.time.LocalDateTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * RateLimiter
 *
 * @Author peanutnowing
 * @Date 2019/11/4
 */
public class RateLimiterDemo {
    public static void main(String[] args) {
        final RateLimiter limiter = RateLimiter.create(3);
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++) {
            limiter.acquire();
            executorService.submit(() -> {
                System.out.println(Thread.currentThread() + ":" + LocalDateTime.now());
            });
        }
    }
}
