package com.yida.secondgitdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @GetMapping({"/index","","/"})
    public String index() {
        System.out.println("这个git，真是太好用了！！！");
        return "hello world";
    }
}
