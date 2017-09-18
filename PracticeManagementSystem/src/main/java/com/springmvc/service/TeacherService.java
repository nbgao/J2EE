package com.springmvc.service;

import com.springmvc.dao.TeacherInfoMapper;
import com.springmvc.entity.TeacherInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * Created by Pengbing on 2017/5/6.
 */

@Service
public class TeacherService {

    @Autowired
    private TeacherInfoMapper teacherInfoMapper;

    public int deleteByPrimaryKey(Integer tnumber){
        return teacherInfoMapper.deleteByPrimaryKey(tnumber);
    }

    public int insert(TeacherInfo record){
        return teacherInfoMapper.insertSelective(record);
    }

    public TeacherInfo selectByPrimaryKey(Integer tnumber){
        return teacherInfoMapper.selectByPrimaryKey(tnumber);
    }

    public int updateByPrimaryKeySelective(TeacherInfo record){
        return teacherInfoMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(TeacherInfo record){
        return teacherInfoMapper.updateByPrimaryKey(record);
    }

    public ArrayList<TeacherInfo> selectSelective(TeacherInfo record){
        return teacherInfoMapper.selectSelective(record);
    }

}
