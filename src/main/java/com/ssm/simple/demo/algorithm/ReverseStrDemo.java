package com.ssm.simple.demo.algorithm;

/**
 * 字符串反转
 *
 * @Author peanutnowing
 * @Date 2019/5/9
 */
public class ReverseStrDemo {
    public static void main(String[] args) {
        String str ="hello";
        System.out.println(reverseIt(str));
    }

    /**
     * 字符串反转
     * @param str
     * @return
     */
    public static String reverseIt(String str){
        int len = str .length();
        StringBuffer sb = new StringBuffer();
        for (int i =(len -1); i >=0; i--) {
            sb.append( str.charAt( i));
        }
        return sb .toString();
    }
}
