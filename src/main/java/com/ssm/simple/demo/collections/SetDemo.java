package com.ssm.simple.demo.collections;

import org.junit.Test;

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

    /**
     * Set排序
     */
    @Test
    public void sortSet(){
        Set set1 = new HashSet(Arrays.asList("b c e f g a".split(" ")));
        Set set2 = new LinkedHashSet(Arrays.asList("b c e f g a".split(" ")));
        Set set3 = new TreeSet(Arrays.asList("b c e f g a".split(" ")));
        System.out.println(set1);
        System.out.println(set2);
        System.out.println(set3);
    }
}
