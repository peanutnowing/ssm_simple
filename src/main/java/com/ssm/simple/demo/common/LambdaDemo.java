package com.ssm.simple.demo.common;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
}
