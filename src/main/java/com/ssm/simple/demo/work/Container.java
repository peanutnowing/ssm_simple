package com.ssm.simple.demo.work;

import java.util.ArrayList;
import java.util.List;

/**
 * 容器
 *
 * @Author peanutnowing
 * @Date 2020/6/23
 */
public class Container implements Component {

    private String name;

    private List<Component> componentList;

    public Container(String name, List<Component> components){
        this.componentList = new ArrayList<Component>();
        this.name = name;
        this.componentList.addAll(components);
    }

    public void addComponent(Component component) {
        this.componentList.add(component);
    }
    @Override
    public void displayComponent() {
        System.out.println("print "+name);
        this.componentList.forEach(part -> part.displayComponent());
    }
}
