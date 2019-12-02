package com.ssm.simple.demo.algorithm;


import java.util.Stack;

/**
 * 两个栈实现一个队列
 *
 * @Author peanutnowing
 * @Date 2019/12/2
 */
public class StackToQueue<T> {

    Stack<T> stack1 = new Stack<T>();

    Stack<T> stack2= new Stack<T>();

    private void push(T data) {
        stack1.push(data);
    }

    private T pop() {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        T first = stack2.pop();
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        return first;
    }

}
