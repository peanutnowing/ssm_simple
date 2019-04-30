package com.ssm.simple.demo;

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
}
