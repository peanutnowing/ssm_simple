package com.ssm.simple.demo.collections;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * StreamDemo
 *
 * @Author peanutnowing
 * @Date 2019/6/4
 */
public class StreamDemo {
    @Test
    public void streamTest(){
        List<String> names = Arrays.asList("张三", "李四", "王五", "张六");
        List<String> list = names.stream()
                .filter(name -> name.startsWith("张"))
                .collect(Collectors.toList());
        System.out.println(list);
    }
}
