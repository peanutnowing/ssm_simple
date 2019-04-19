package com.ssm.simple.demo;

import com.ssm.simple.utils.StringSimpleUtils;

/**
 * 字符串处理
 *
 * @Author peanutnowing
 * @Date 2019/4/19
 */
public class StringDemo {
    public static void main(String[] args) {
        //去掉括号两种方法 1.截取截取字符串
        String numbers = "[1,2,3,4,5]";
        String[] array = StringSimpleUtils.removeBrackets(numbers);
        for (String str : array) {
            System.out.println(str);
        }

        //2.正则表达式
    }
}
