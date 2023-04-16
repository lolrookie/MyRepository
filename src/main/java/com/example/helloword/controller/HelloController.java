package com.example.helloword.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
public class HelloController {

//    http://localhost:80/hello
//    http://localhost:80/hello?nickname=zhangsan&phone=132
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    @GetMapping("/hello")
    public String hello(String nickname,String phone){
        System.out.println(phone);
        return "你好" + nickname;
    }
}
