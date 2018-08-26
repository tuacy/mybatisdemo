package com.tuacy.mybatisdemo.controller;

import com.tuacy.mybatisdemo.model.User;
import com.tuacy.mybatisdemo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/app/")
public class AppController {


    private IUserService userService;

    @Autowired
    public void setUserService(IUserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "updateUser", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity updateUserList(@RequestBody List<User> userList) {
        userService.updateUserList(userList);
        return ResponseEntity.ok(userList);
    }

    @RequestMapping(value = "getUser", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity getUser(@RequestBody User user) {
        return ResponseEntity.ok(userService.getUserList(user));
    }

    @RequestMapping(value = "getUserByName", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity getUserByName(@RequestBody List<String> nameList) {
        return ResponseEntity.ok(userService.getUserListByName(nameList));
    }
}
