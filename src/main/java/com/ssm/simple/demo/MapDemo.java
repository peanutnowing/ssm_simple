package com.ssm.simple.demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Map的几种遍历用法
 *
 * @Author peanutnowing
 * @Date 2019/4/9
 */
public class MapDemo {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        //每种编程语言和排名对应
        map.put("Java",1);
        map.put("C",2);
        map.put("Python",3);
        map.put("C++",4);
        map.put("PHP",5);

        //第一种遍历方法
        Iterator<Map.Entry<String, Integer>> entries = map.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<String, Integer> entry = entries.next();
            System.out.println("key = " + entry.getKey() + ", value = " + entry.getValue());
        }

        //第二种遍历方法
        for (String key:map.keySet()) {
            Integer value = map.get(key);
            System.out.println("key="+key+",value="+value);
        }

        //第三种方法遍历（最常用的方法）
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
        }
    }
}
