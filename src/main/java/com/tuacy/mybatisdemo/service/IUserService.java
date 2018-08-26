package com.tuacy.mybatisdemo.service;


import com.tuacy.mybatisdemo.model.User;

import java.util.List;

public interface IUserService {

    List<User> getUserListByName(List<String> nameList);

    List<User> getUserList(User user);

    void updateUserList(List<User> userList);

}
