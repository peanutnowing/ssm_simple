package com.ssm.simple.demo.common;

import org.junit.Test;

import java.util.Random;

/**
 * 随机数demo
 *
 * @Author peanutnowing
 * @Date 2019/10/25
 */
public class RandomDemo {
    /**
     * 700次，每次随机出一个4位数
     */
    @Test
    public void listToMapTest() {
        for (int i=0;i<700;i++){
            System.out.println((int)((Math.random()*9+1)*1000));
        }
    }
}
