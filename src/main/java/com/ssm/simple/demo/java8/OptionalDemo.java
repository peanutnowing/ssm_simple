package com.ssm.simple.demo.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Optional
 *
 * @Author peanutnowing
 * @Date 2020/6/1
 */
public class OptionalDemo {

    public static void main(String[] args) {

        List<String> userList = new ArrayList();
        userList.add("曹操");
        userList.add("刘备");
        userList.add("孙权");
        userList.add(null);
        if (userList != null) {
            for (String userName : userList) {
                System.out.println(userName);
            }
        }
        Optional.ofNullable(userList).orElse(new ArrayList<>()).forEach(user -> {
            System.out.println(user);
        });
    }
}
