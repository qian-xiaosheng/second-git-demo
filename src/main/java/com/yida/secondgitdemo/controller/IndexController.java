package com.yida.secondgitdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @GetMapping({"/index","","/"})
    public String index() {
        System.out.println("这个git，真是太好用了！！！");
        System.out.println("这个git，真是太好用了2！！！");
        System.out.println("这个git，真是太好用了3！！！");
        System.out.println("这个git，真是太好用了4！！！");
        System.out.println("这个git，真是太好用了55555！！！");
        return "hello world";
    }

    @GetMapping("/hello")
    public String hello() {
        return "宜达互联";
    }
}
