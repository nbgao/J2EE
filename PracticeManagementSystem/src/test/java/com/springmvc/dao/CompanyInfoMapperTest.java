package com.springmvc.dao;

import com.springmvc.entity.CompanyInfo;
import com.springmvc.entity.StudentInfo;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by liu on 2017/5/5.
 */
public class CompanyInfoMapperTest {

    private ApplicationContext applicationContext;
    @Autowired//autowired==自动装配
    private CompanyInfoMapper companyInfoMapper;

    @Before
    public void setUp() throws Exception {
        applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");//加载spring配置文件
        companyInfoMapper=applicationContext.getBean(CompanyInfoMapper.class);//在这里导入要测试的
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void insert() throws Exception {
        CompanyInfo companyInfo=new CompanyInfo();
        companyInfo.setCid(100003);
        companyInfo.setCname("网易");
        companyInfo.setCpassword("www163com");
        companyInfo.setPraiserate(87);

        int result = companyInfoMapper.insertSelective(companyInfo);
        System.out.println(result);
        assert (result == 1);
    }

}