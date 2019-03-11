package com.ssm.simple.java8;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
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







    }
}
