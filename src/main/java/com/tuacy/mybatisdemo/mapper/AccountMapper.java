package com.tuacy.mybatisdemo.mapper;

import com.tuacy.mybatisdemo.model.Account;

public interface AccountMapper {
    int deleteByPrimaryKey(Integer pkid);

    int insert(Account record);

    int insertSelective(Account record);

    Account selectByPrimaryKey(Integer pkid);

    int updateByPrimaryKeySelective(Account record);

    int updateByPrimaryKey(Account record);
}