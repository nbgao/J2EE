package com.springmvc.dao;

import com.springmvc.entity.User;

import java.util.ArrayList;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    int getCount();

    ArrayList<User> selectAll();

    ArrayList<User> selectSelective(User record);

    ArrayList<User> selectLike(User record);
}