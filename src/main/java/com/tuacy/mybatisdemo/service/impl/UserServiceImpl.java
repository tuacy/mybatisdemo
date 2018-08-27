package com.tuacy.mybatisdemo.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.tuacy.mybatisdemo.mapper.AppMapper;
import com.tuacy.mybatisdemo.model.User;
import com.tuacy.mybatisdemo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service(value = "userService")
public class UserServiceImpl implements IUserService {

    private AppMapper appMapper;

    @Autowired
    public void setAppMapper(AppMapper appMapper) {
        this.appMapper = appMapper;
    }

    @Override
    public List<User> getUserListByName(List<String> nameList) {
        Page<User> pageInfo = PageHelper.startPage(1, 20, true);
        appMapper.selectUserByName(nameList);
        long count = pageInfo.getTotal();
        int pageNum = pageInfo.getPageNum();
        return pageInfo;
    }

    @Override
    public List<User> getUserList(User user) {
        return appMapper.selectUser(user);
    }

    @Override
    public void updateUserList(List<User> userList) {
        if (userList == null || userList.isEmpty()) {
            return;
        }
        List<User> insertList = null;
        List<User> updateList = null;
        for (User item : userList) {
            if (item.getPkid() == null) {
                if (insertList == null) {
                    insertList = new ArrayList<>();
                }
                insertList.add(item);
            } else {
                if (updateList == null) {
                    updateList = new ArrayList<>();
                }
                updateList.add(item);
            }
        }
        if (insertList != null && !insertList.isEmpty()) {
            int insertCount = appMapper.insertUserBatch(userList);
        }
        if (updateList != null && !updateList.isEmpty()) {
            int insertCount = appMapper.updateUserBatch(userList);
        }
        int a = 10;
    }
}
