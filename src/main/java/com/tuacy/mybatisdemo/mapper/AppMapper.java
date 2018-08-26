package com.tuacy.mybatisdemo.mapper;


import com.tuacy.mybatisdemo.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 我们手动添加的mapper
 */
@Mapper
public interface AppMapper {

    /**
     * 查找指定的user
     */
    List<User> selectUser(@Param("user") User user);

    List<User> selectUserByName(@Param("nameList") List<String> nameList);

    /**
     * 批量插入并且更新主键
     */
    int insertUserBatch(List<User> userList);

    /**
     * 批量更新
     */
    int updateUserBatch(List<User> userList);

}