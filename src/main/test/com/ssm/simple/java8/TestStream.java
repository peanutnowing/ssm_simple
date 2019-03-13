package com.ssm.simple.java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * JDK8的特性-流
 *
 * @Author peanutnowing
 * @Date 2019/3/11
 */
public class TestStream {
    public static void main(String[] args) {

        List<Integer> numList = Arrays.asList(1,2,3);

        numList.stream().forEach(n->
                System.out.println(n));


        numList.parallelStream().forEach(n->
                System.out.println(n));


        //将字符串列表转换为大写
        List<String> stringList = Arrays.asList("a", "b", "c", "d");

        List<String> newList = new ArrayList<>();
        //Java8之前的写法
        for (String s : stringList) {
            newList.add(s.toUpperCase());
        }
        System.out.println(newList);

        //Java8的写法
        List<String> collect = stringList.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(collect);



    }
}
