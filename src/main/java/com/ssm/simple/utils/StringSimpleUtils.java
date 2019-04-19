package com.ssm.simple.utils;

/**
 * 字符串简单处理工具类
 *
 * @Author peanutnowing
 * @Date 2019/4/19
 */
public class StringSimpleUtils {

    /**
     * 截取字符串（去掉括号等）
     * @param str
     * @return 去掉括号后的数组
     */
    public static String[] removeBrackets(String str){
        str = str.substring(1, str.length()-1);
        String [] strArray = str.split(",");
        return strArray;
    }

}
