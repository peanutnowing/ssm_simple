package com.ssm.simple.entity;

import lombok.Data;

import java.util.Date;

/**
 * 实体类：用户
 *
 * @Author peanutnowing
 * @Date 2019/1/21
 */
@Data
public class User {
    /**
     * 主键
     */
    private Long id;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 密码
     */
    private String password;
    /**
     * 令牌
     */
    private String token;
    /**
     * 是否已经删除 0未删除 1已删除
     */
    private int isDeleted;
    /**
     * 用户真实姓名
     */
    private String trueName;
    /**
     * 用户电话
     */
    private String  mobile;
    /**
     * 创建时间
     */
    private Date createTime;
}

