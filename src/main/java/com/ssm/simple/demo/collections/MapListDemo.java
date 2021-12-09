package com.ssm.simple.demo.collections;

import com.ssm.simple.po.User;
import org.junit.Test;

import java.util.*;

/**
 * Map与List
 *
 * @Author peanutnowing
 * @Date 2019/5/8
 */
public class MapListDemo {
    public static void main(String[] args) {
        Map<User,List<Integer>> map = new HashMap<>();
        User user = new User();
        user.setId(1111L);
        user.setMobile(15800000101L);
        map.put(user,new ArrayList<>(1));

        User user2 = new User();
        user2.setId(2222L);
        user2.setMobile(15800000202L);
        map.put(user2,new ArrayList<>(1));

        System.out.println(map);
    }

    @Test
    public void streamBaseTest(){
        List<User> userList = new ArrayList<>();
        User user = new User();
        user.setId(1111L);
        user.setMobile(15800000101L);
        userList.add(user);

        User user2 = new User();
        user2.setId(2222L);
        user2.setMobile(15800000202L);
        userList.add(user2);

        userList.stream()
                .filter((e) -> e.getId() ==2222)
                .forEach(System.out::println);
    }
}
