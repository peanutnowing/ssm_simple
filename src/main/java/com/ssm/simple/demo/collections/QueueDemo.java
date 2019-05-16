package com.ssm.simple.demo.collections;

import org.junit.Test;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * 队列使用demo
 *
 * @Author peanutnowing
 * @Date 2019/4/9
 */
public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        //offer添加元素
        queue.offer("https://book.douban.com/subject/4913064/");
        queue.offer("https://book.douban.com/subject/25862578/");
        queue.offer("https://book.douban.com/subject/1770782/");
        boolean result = true;
        while(result){
            if(queue.isEmpty()){
                result = false;
            }else {
                //移除并返问队列头部的元素，如果队列为空，则返回null
                String url = queue.poll();
                System.out.println(url);
            }
        }

    }

    /**
     * 队列test
     */
    @Test
    public void queueTest(){
        Queue<String> queue = new LinkedList<>();
        queue.offer("www.111.com");
        Set<String> urlSet = new HashSet<>();
        boolean result = true;
        while (result){
            if(queue.isEmpty()){
                result = false;
            }else {
                //移除并返问队列头部的元素，如果队列为空，则返回null
                String url = queue.poll();
                if (urlSet.contains(url)){
                    break;
                }else {
                    urlSet.add(url);
                }
                System.out.println(url);
                queue.offer("www.222.com");
            }

        }
    }
}
