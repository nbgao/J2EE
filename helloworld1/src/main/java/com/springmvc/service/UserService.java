package com.springmvc.service;

import com.springmvc.dao.UserMapper;
import com.springmvc.entity.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

/**
 * Created by Pengbing on 2017/4/20.
 */
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public int insert(User user){
        return userMapper.insertSelective(user);
    }

    public int deleteByPrimaryKey(Integer id){
        return userMapper.deleteByPrimaryKey(id);
    }

    public User selectByPrimaryKey(Integer id){
        return userMapper.selectByPrimaryKey(id);
    }

    public ArrayList<User> selectAll(){
        return userMapper.selectAll();
    }

    public int updateByPrimarySelective(User record){
        return userMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(User record){
        return userMapper.updateByPrimaryKey(record);
    }

    public int getCount(){
        return userMapper.getCount();
    }

    public ArrayList<User> selectSelective(User record){
        return userMapper.selectSelective(record);
    }

    public ArrayList<User> selectLike(User record){
        return userMapper.selectLike(record);
    }


 }
