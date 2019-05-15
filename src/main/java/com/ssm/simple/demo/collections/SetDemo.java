package com.ssm.simple.demo.collections;

import java.util.*;

/**
 * 集合Set相关使用
 *
 * @Author peanutnowing
 * @Date 2019/4/17
 */
public class SetDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("耐克","耐克","安德玛","彪马"));
        Set<String> set = new HashSet<>();
        set.addAll(list);

        //遍历set方法1
        for (String i:set){
            System.out.println(i);
        }
        //遍历set方法2
        Iterator it1 = set.iterator();
        while(it1.hasNext()){
            System.out.println(it1.next());
        }


    }
}
