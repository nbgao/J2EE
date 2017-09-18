package com.springmvc.dao;

import com.springmvc.entity.User;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by Pengbing on 2017/4/14.
 */
public class UserMapperTest {
    protected ApplicationContext applicationContext;
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
    public void selectLike() throws Exception{
        User user = new User();
        user.setName("2");
        ArrayList<User> list = userMapper.selectLike(user);
        for(User a:list)
            System.out.println(a);
    }

    @Test
    public void testInsert() throws Exception {
        User user = new User();
        user.setId(13);
        int result = userMapper.insertSelective(user);
        System.out.println(result);
        assert (result == 1);
    }

    @Test
    public void getCount() throws Exception {
        System.out.println(userMapper.getCount());
    }

    @Test
    public void selectSelective() throws Exception{
        User user = new User();
        user.setName("2");
        ArrayList<User> list = userMapper.selectSelective(user);
        for(User a:list){
            System.out.println(a);
        }

    }

}