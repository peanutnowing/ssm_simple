package com.ssm.simple.demo.algorithm;

/**
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 */
public class StairsDemo {
    public static void main(String[] args) {
        System.out.println(climbStairs(4));
    }

    public static  int climbStairs(int n) {
        int f0 = 0, f1 = 1, fn = 0;
        for (int i = 0; i <= n; i++) {
            fn = f0 + f1;
            f0 = f1;
            f1 = fn;
        }
        return f0;
    }
}
