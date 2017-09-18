package com.springmvc.dao;

import com.springmvc.entity.User;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by Pengbing on 2017/5/3.
 */
public class UserMapperTest {

    private ApplicationContext applicationContext;

    @Autowired
    private UserMapper userMapper;

    @Before
    public void setUp() throws Exception {
        applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
        userMapper = applicationContext.getBean(UserMapper.class);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void insert() throws Exception {
        User user = new User();
        user.setId(14);
        int result = userMapper.insertSelective(user);
        System.out.println(result);
        assert (result == 1);
    }

}