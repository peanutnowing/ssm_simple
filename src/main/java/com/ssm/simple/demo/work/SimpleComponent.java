package com.ssm.simple.demo.work;

/**
 *
 * 简单组件
 * @Author peanutnowing
 * @Date 2020/6/23
 */
public class SimpleComponent implements Component{

    private String name;

    public SimpleComponent(String name) {
        this.name = name;
    }

    @Override
    public void displayComponent() {
        System.out.println("print "+name);
    }
}
