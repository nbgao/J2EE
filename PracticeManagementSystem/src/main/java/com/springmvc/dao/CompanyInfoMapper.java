package com.springmvc.dao;

import com.springmvc.entity.CompanyInfo;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyInfoMapper {
    int deleteByPrimaryKey(Integer cid);

    int insert(CompanyInfo record);

    int insertSelective(CompanyInfo record);

    CompanyInfo selectByPrimaryKey(Integer cid);

    int updateByPrimaryKeySelective(CompanyInfo record);

    int updateByPrimaryKey(CompanyInfo record);
}