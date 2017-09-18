package com.springmvc.dao;

import com.springmvc.entity.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    int getCount();

    ArrayList<User> selectSelective(User record);

    ArrayList<User> selectLike(User record);

    ArrayList<User> selectAll();

}