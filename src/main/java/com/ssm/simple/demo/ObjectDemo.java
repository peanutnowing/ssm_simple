package com.ssm.simple.demo;

import com.ssm.simple.po.User;

/**
 * 对象相关
 *
 * @Author peanutnowing
 * @Date 2019/4/24
 */
public class ObjectDemo {
    public static void main(String[] args) {
        User userA = new User();
        userA.setName("超人");
        userA.setMobile(15800001111L);
        User userB = new User();
        userB.setName("超人");
        userB.setMobile(158000011112L);
        //User对象需要重写equals方法和hashcode方法
        if (userA.equals(userB)){
            System.out.println("两个对象相等");
        }else {
            System.out.println("两个对象不相等");
        }
    }
}
