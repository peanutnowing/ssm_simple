package com.ssm.simple.demo;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 循环demo
 *
 * @Author peanutnowing
 * @Date 2019/4/22
 */
public class ForDemo {
    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        for (int i: array){
            if(i%2==0) {
                System.out.println(i);
                break;
            }
        }
        System.out.println("------------");
        for (int i: array){
            if(i%2==0) {
                System.out.println(i);
                continue;
            }
        }
    }
    @Test
    public void forBreakTest() {
        int[] src = {1,2,3,4,5,6,7,8,9,10};
        List<int[]> list = Arrays.asList(src);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i).toString());
        }
    }

}
