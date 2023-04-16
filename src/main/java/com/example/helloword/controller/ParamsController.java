package com.example.helloword.controller;

import com.example.helloword.entity.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

//404:路径有问题
//405：方法不被允许
//500:后端问题
@RestController
public class ParamsController {

    @RequestMapping(value = "/getTest1",method = RequestMethod.GET)
    public String getTest1(){
        return "GET请求";
    }

    @RequestMapping(value = "/getTest2",method = RequestMethod.GET)
    //http://localhost:8080/getTest2?nickname=niuzi&phone=123
    public String getTest2(String nickname,String phone){
        System.out.println("nickname:" + nickname);
        System.out.println("phone:" + phone);
        return "GET请求";
    }

    @RequestMapping(value = "/getTest3",method = RequestMethod.GET)
//    http://localhost:8080/getTest2?nickname=niuzi
    public String getTest3(@RequestParam(value = "nickname",required = false) String name){
        System.out.println("nickname:" + name);
        return "GET请求";
    }

    @RequestMapping(value = "/postTest1",method = RequestMethod.POST)
    public String postTest1(){
        return "POST请求";
    }

    @RequestMapping(value = "/postTest2",method = RequestMethod.POST)
    public String postTest2(String username,String password){
        System.out.println("username:" + username);
        System.out.println("password:" + password);
        return "POST请求";
    }

    @RequestMapping(value = "/postTest3",method = RequestMethod.POST)
    public String postTest3(User user){
        System.out.println(user);
        return "POST请求";
    }

    @RequestMapping(value = "/postTest4",method = RequestMethod.POST)
    //json格式
    public String postTest4(@RequestBody User user){
        System.out.println(user);
        return "POST请求";
    }

    @RequestMapping(value = "/test/**")
    public String test(User user){
        return "通配符请求";
    }
}
