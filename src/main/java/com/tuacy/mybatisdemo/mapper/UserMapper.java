package com.tuacy.mybatisdemo.mapper;

import com.tuacy.mybatisdemo.model.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer pkid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer pkid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKeyWithBLOBs(User record);

    int updateByPrimaryKey(User record);
}