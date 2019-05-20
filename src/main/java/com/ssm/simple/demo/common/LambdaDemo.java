package com.ssm.simple.demo.common;

import org.junit.Test;

import java.util.*;

/**
 * lambda表达式的使用
 *
 * @Author peanutnowing
 * @Date 2019/5/20
 */
public class LambdaDemo {
    /**
     * list在forEach中使用lambda
     */
    @Test
    public void listDemo(){
        List<String> arrayList = new ArrayList<>();
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        arrayList.forEach(System.out::println);
    }

    /**
     * map在forEach中使用lambda
     */
    @Test
    public void mapDemo(){
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");
        map.put(4,"d");
        map.forEach((key,value)->System.out.println(key+"---"+value));
    }

    /**
     * 数组如何在forEach中使用lambda
     * 先转换为List，再使用
     */
    @Test
    public void arrayDemo(){
        String[] strArray = new String[]{"苹果","小米","华为"};
        //数组转成list
        Arrays.asList(strArray).forEach(System.out::println);
        //数组转成流
        Arrays.stream(strArray).forEach(System.out::println);
    }
}
