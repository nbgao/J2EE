package com.springmvc.dao;

import com.springmvc.entity.WorkList;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkListMapper {
    int deleteByPrimaryKey(Integer cid);

    int insert(WorkList record);

    int insertSelective(WorkList record);

    WorkList selectByPrimaryKey(Integer cid);

    int updateByPrimaryKeySelective(WorkList record);

    int updateByPrimaryKey(WorkList record);
}