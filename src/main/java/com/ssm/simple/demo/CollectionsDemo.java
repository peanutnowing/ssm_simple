package com.ssm.simple.demo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static javafx.scene.input.KeyCode.T;

/**
 * 集合类用法demo
 * Created by peanutnowing on 2019/3/10.
 */
public class CollectionsDemo {
    /**
     * Set转换为List
     * @param set
     * @return
     */
    public List<String> setToList(Set<String> set){
        List<String> list = new ArrayList(new HashSet<>());
        return list;
    }

    /**
     * List转换为Set
     * @param list
     * @return
     */
    public Set<String> listToSet(List<String> list){
        Set<String> set = new HashSet<>(list);
        return set;
    }


    public static void main(String[] args) {
       /* Set<String> set = new HashSet<>();
        set.add("1");
        set.add("2");
        set.add("3");
        for (String str:set){
            System.out.println(str);
        }
        List<String> list = new ArrayList<>(set);
        for (String str:list) {
            System.out.println(str);
        }*/
        List<String> list = new ArrayList<>();
        list.add("一");
        list.add("二");
        list.add("二");
        list.add("三");
        //List转换Set可以去重
        Set<String> set = new HashSet<>(list);
        for (String str:set
             ) {
            System.out.println(str);

        }


    }
}
