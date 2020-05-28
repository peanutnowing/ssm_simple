package com.ssm.simple.demo.java8;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Java8测试
 *
 * @Author peanutnowing
 * @Date 2020/5/26
 */
public class Java8Test {
    public static void main(String[] args) {
        List<String> companyName1 = new ArrayList<String>();
        companyName1.add("Google");
        companyName1.add("Amazon");
        companyName1.add("MicroSoft");
        companyName1.add("Alibaba");
        companyName1.add("Apple");

        List<String> companyName2 = new ArrayList<String>();
        companyName2.add("Google");
        companyName2.add("Amazon");
        companyName2.add("MicroSoft");
        companyName2.add("Alibaba");
        companyName2.add("Apple");

        Java8Test test = new Java8Test();
        System.out.println("使用Java7语法");
        test.sortUseJava7(companyName1);

        System.out.println(companyName1);
        System.out.println("使用Java8语法: ");

        test.sortUseJava8(companyName2);
        System.out.println(companyName2);
    }

    /**
     * 使用Java7排序
     * @param companyNames
     */
    private void sortUseJava7(List<String> companyNames){
        Collections.sort(companyNames, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
    }

    /**
     * 使用Java8排序
     * @param companyNames
     */
    private void sortUseJava8(List<String> companyNames){
        Collections.sort(companyNames,(o1,o2)->o1.compareTo(o2));
    }

}
