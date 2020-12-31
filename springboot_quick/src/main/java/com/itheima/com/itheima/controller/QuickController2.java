package com.itheima.com.itheima.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class QuickController2 {
    @Value("${name}")
    private String userName;

    @Value("${person.age}")
    private Integer age;

    @RequestMapping("/quick2")
    @ResponseBody
    public String quick(){
        return "hello springboot"+userName+" 年龄："+age;
    }
}
