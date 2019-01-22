package com.ssm.simple.service;

import com.ssm.simple.entity.User;

/**
 * 用户相关接口
 *
 * @Author peanutnowing
 * @Date 2019/1/22
 */
public interface UserService {

    /**
     * 新增用户
     * @param userName
     * @param password
     * @return
     */
    int addUser(String userName, String password);

    /**
     * 登录
     * @param userName
     * @param password
     * @return
     */
    User loginByToken(String userName, String password);

    /**
     * 根据token获取用户信息
     * @param token
     * @return
     */
    User getUserByToken(String token);




}
