package com.ssm.simple.demo.thread;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
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

    private static ExecutorService executorService = Executors.newFixedThreadPool(3);

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

    @Test
    public void executeServiceTest(){

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        List<String> list2 = new ArrayList<>();
        list2.add("a");
        list2.add("b");
        list2.add("c");
        list2.add("d");
        list2.add("e");
        list2.add("f");

        executorService.execute(()-> list2.forEach(System.out::println));

        executorService.execute(()->  list1.forEach(System.out::println));


    }

    /**
     * 线程池打印
     */
    @Test
    public void executeService2Test(){
        List<Integer> list1 = new ArrayList<>();

        List<Integer> list2 = new ArrayList<>();
        for(int i=1;i<=20;i++){
            list1.add(i);
            list2.add(i+10);
        }
        System.out.println("list1's size:"+list1.size());

        System.out.println("list2's size:"+list2.size());
        executorService.execute(()->  list1.forEach(System.out::println));

        executorService.execute(()-> list2.forEach(System.out::println));

    }

    @Test
    public void executeServiceTest3(){

        ExecutorService executorService = Executors.newFixedThreadPool(3);
//      ExecutorService executorService = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 5; i++){
            executorService.execute(new TestRunnable());
            System.out.println("************* a" + i + " *************");
        }
        executorService.shutdown();
    }

    class TestRunnable implements Runnable{
        public void run(){
            System.out.println(Thread.currentThread().getName() + "线程被调用了。");
        }
    }

}
