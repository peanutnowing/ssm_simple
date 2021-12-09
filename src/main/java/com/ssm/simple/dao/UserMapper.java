package com.ssm.simple.dao;

import com.ssm.simple.po.User;
/**
 * DAO:用户
 *
 * @Author peanutnowing
 * @Date 2019/1/24
 */
public interface UserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}