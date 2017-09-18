package com.springmvc.dao;

import com.springmvc.entity.TeacherInfo;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by Pengbing on 2017/5/6.
 */
public class TeacherInfoMapperTest {

    private ApplicationContext applicationContext;
    @Autowired
    private TeacherInfoMapper teacherInfoMapper;


    @Before
    public void setUp() throws Exception {
        applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
        teacherInfoMapper = applicationContext.getBean(TeacherInfoMapper.class);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void insert() throws Exception {

        TeacherInfo teacher = new TeacherInfo();
        /*teacher.setTnumber(500001);
        teacher.setTpassword("pw500001");
        teacher.setTname("教师1");
        teacher.setTidentity(1);
        teacher.setTdepartment("计算机学院");
        teacher.setTmajor("计算机图像处理");
        teacher.setTphone("18100500001");*/

        /*teacher.setTnumber(500002);
        teacher.setTpassword("pw500002");
        teacher.setTname("教师2");
        teacher.setTidentity(1);
        teacher.setTdepartment("计算机学院");
        teacher.setTmajor("海量数据存储");
        teacher.setTphone("18100500002");*/

        teacher.setTnumber(500003);
        teacher.setTpassword("pw500003");
        teacher.setTname("教务处副处长");
        teacher.setTidentity(2);
        teacher.setTdepartment("教务处");
        teacher.setTmajor("学籍管理");
        teacher.setTphone("18100500003");

        int result = teacherInfoMapper.insertSelective(teacher);
        System.out.println(result);
        assert (result==1);
    }

}