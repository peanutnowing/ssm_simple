package com.ssm.simple.service.impl;

import com.ssm.simple.po.User;
import com.ssm.simple.service.UserService;

/**
 * 用户相关实现类
 *
 * @Author peanutnowing
 * @Date 2019/1/22
 */
public class UserServiceImpl implements UserService {
    /**
     * 新增用户
     * @param userName
     * @param password
     * @return
     */
    @Override
    public int addUser(String userName, String password) {
        return 0;
    }
    /**
     * 登录
     * @param userName
     * @param password
     * @return
     */
    @Override
    public User loginByToken(String userName, String password) {
        return null;
    }
    /**
     * 根据token获取用户信息
     * @param token
     * @return
     */
    @Override
    public User getUserByToken(String token) {
        return null;
    }
}
