package com.ssm.simple.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * DTO：用户
 *
 * @Author peanutnowing
 * @Date 2019/1/21
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    /**
     * 用户编号，主键
     */
    private Long id;
    /**
     * 用户名
     */
    private String userName;
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