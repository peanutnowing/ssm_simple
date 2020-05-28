package com.ssm.simple.demo.java8;

import com.ssm.simple.entity.User;
import org.junit.Test;
import java.text.ParseException;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * StreamDemo
 *
 * @Author peanutnowing
 * @Date 2019/6/4
 */
public class StreamDemo {
    /**
     *生成流
     */
    @Test
    public void streamTest() throws ParseException {
        List<String> names = Arrays.asList("张三", "李四", "王五", "张六");
        List<String> list = names.stream().filter(name -> !name.isEmpty()).collect(Collectors.toList());
        //forEach迭代流
        list.forEach(System.out::println);
        //Collectors可将流转成集合和聚合原始，也可以用于返回列表或字符串
        String mergedStr  = names.stream().filter(name -> !name.isEmpty()).collect(Collectors.joining(","));
        System.out.println(mergedStr);
    }

    /**
     *过滤、分组、排序等
     */
    @Test
    public void streamGroupTest(){
        User user1 = new User();
        user1.setId(1L);
        user1.setUserName("张三");
        user1.setAge(27);

        User user2 = new User();
        user2.setId(2L);
        user2.setUserName("李四");
        user2.setAge(21);

        User user3 = new User();
        user3.setId(3L);
        user3.setUserName("王五");
        user3.setAge(29);

        User user4 = new User();
        user4.setId(4L);
        user4.setUserName("刘六");
        user4.setAge(38);

        User user5 = new User();
        user5.setId(1L);
        user5.setUserName("张三");
        user5.setAge(26);

        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        userList.add(user5);
        //过滤
        userList = userList.stream().filter(t -> (t.getAge() < 30)).collect(Collectors.toList());
        //根据年龄排序
        Comparator<User> comparator = new Comparator<User>(){
            @Override
            public int compare(User u1, User u2) {
                return u2.getAge()-u1.getAge();
            }};
        //分组
        Map<Long, List<User>> userMap = userList.stream().collect(Collectors.groupingBy(user -> user.getId()));
        for (Map.Entry<Long,  List<User>> entry : userMap.entrySet()) {
            Collections.sort(entry.getValue(),comparator);
            System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue().get(0));
        }

    }

    /**
     *list转换为map
     */
    @Test
    public void listToMapTest() {
        User user1 = new User();
        user1.setId(1L);
        user1.setUserName("张三");
        user1.setAge(27);

        User user2 = new User();
        user2.setId(2L);
        user2.setUserName("李四");
        user2.setAge(21);

        User user3 = new User();
        user3.setId(3L);
        user3.setUserName("王五");
        user3.setAge(29);

        User user4 = new User();
        user4.setId(4L);
        user4.setUserName("刘六");
        user4.setAge(38);

        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);

        Map<Long, User> userMap = userList.stream().collect(Collectors.toMap(User::getId, Function.identity()));
        for (Map.Entry<Long, User> entry : userMap.entrySet()) {
            System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
        }
    }

    /**
     * 统计
     */
    @Test
    public void statisticsTest(){
        List<Integer> numbers = Arrays.asList(63, 22, 22, 33, 77, 33, 51);
        IntSummaryStatistics statistics = numbers.stream().mapToInt((x) -> x).summaryStatistics();
        System.out.println("列表中最大的数 : " + statistics.getMax());
        System.out.println("列表中最小的数 : " + statistics.getMin());
        System.out.println("所有数之和 : " + statistics.getSum());
        System.out.println("平均数 : " + statistics.getAverage());
    }

}
