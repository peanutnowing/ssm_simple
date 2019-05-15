package com.ssm.simple.demo.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * List基本用法
 *
 * @Author peanutnowing
 * @Date 2019/4/19
 */
public class ListDemo {
    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<>();
        numList.add(2);
        numList.add(55);
        numList.add(66);
        numList.add(88);
        numList.add(77);

        System.out.println(numList.get(0));
        System.out.println(numList.get(numList.size()-1));
     }
}
