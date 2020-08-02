package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2020/8/2.
 */
@Controller
public class HomeController {
    @ResponseBody
    @RequestMapping("hello")
    public String hello(){
        return "hello222222222";
    }
}
