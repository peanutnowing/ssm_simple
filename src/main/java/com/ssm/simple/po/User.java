package com.ssm.simple.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * 实体类：用户
 *
 * @Author peanutnowing
 * @Date 2019/1/21
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    /**
     * 用户编号，主键
     */
    private Long id;
    /**
     * 用户名
     */
    private String name;
    /**
     * 电话
     */
    private Long mobile;
    /**
     * 年龄
     */
    private Integer age;
    /**
     * 性别
     */
    private Integer sex;
    /**
     * 家庭住址
     */
    private String address;


}