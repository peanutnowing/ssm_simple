package com.ssm.simple.demo;

import com.ssm.simple.entity.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        user.setMobile("15800000101");
        map.put(user,new ArrayList<>(1));

        User user2 = new User();
        user2.setId(2222L);
        user2.setMobile("15800000202");
        map.put(user2,new ArrayList<>(1));

        System.out.println(map);
    }
}
