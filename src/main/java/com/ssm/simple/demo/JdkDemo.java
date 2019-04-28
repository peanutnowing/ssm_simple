package com.ssm.simple.demo;

/**
 * JDK相关
 *
 * @Author peanutnowing
 * @Date 2019/4/28
 */
public class JdkDemo {
    public static void main(String[] args) {
        //JDK1.8用"."分割字符串会有问题,JDK的bug
        String str = "ABC.DEF.GHI";
        String[] array = str.split(".");
        System.out.println(array.length);

        //一般字符分割用","和"-"
        String str2 = "ABC-DEF-GHI";
        String[] array2 = str2.split("-");
        System.out.println(array2.length);
    }
}
