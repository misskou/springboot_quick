package com.itheima.controller;

import com.itheima.domain.User;
import com.itheima.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class QuickController {
    @RequestMapping("/quick")
    public String quick(){
        return "springBoot 12345678!!";
    }

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/query")
    public List<User> queryUserList(){
        List<User> users = userMapper.queryUserList();
        return users;
    }
}
