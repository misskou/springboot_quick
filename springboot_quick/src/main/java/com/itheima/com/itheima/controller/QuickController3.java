package com.itheima.com.itheima.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@ConfigurationProperties(prefix = "person")
public class QuickController3 {

    private String name;

    private Integer age;

    private String addr;

    @Autowired
    private HttpServletRequest request;



    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @RequestMapping("/quick3")
    @ResponseBody
    public String quick(){
        System.out.println(request.getServletContext().getInitParameter("myservletName"));
        return "hello "+name+" 年龄fff："+age+" 住址19332："+addr;
    }
}
