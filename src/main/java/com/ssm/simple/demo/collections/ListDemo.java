package com.ssm.simple.demo.collections;

import org.junit.Test;

import java.util.*;

/**
 * List基本用法
 *
 * @Author peanutnowing
 * @Date 2019/4/19
 */
public class ListDemo {
    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<>();
        numList.add(2);
        numList.add(55);
        numList.add(66);
        numList.add(88);
        numList.add(77);

        System.out.println(numList.get(0));
        System.out.println(numList.get(numList.size()-1));
     }
    @Test
    public void testArrayList(){
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        remove2(list,"c");// 删除指定的“b”元素
        System.out.println(list);
    }

    /**
     * 删除ArrayList元素正确的方法
     * @param list
     */
    public static void remove(List<String> list,String target) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String str = it.next();
            if (target.equals(str)) {
                it.remove();
            }
        }
    }
    /**
     * 删除ArrayList元素错误的方法
     * @param list
     */
    public static void remove2(List<String> list,String target) {
      for (String item : list) {
        if (target.equals(item)) {
            list.remove(item);
        }
      }
    }

    /**
     * List中随机抽取一个值
     */
    @Test
    public void testRandomList(){
        List<Integer> list = new ArrayList<Integer>();
        Random random = new Random();
        list.add(1);
        list.add(21);
        list.add(31);
        list.add(22);
        list.add(33);
        list.add(23);
        System.out.println(list.get(random.nextInt(list.size())));
    }
}
