package com.lll.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author Liulele
 * @Date 2019/7/2814:29
 **/
@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/hello")
    public String hello(String s) {
        return "hello9092" + s;
    }
}
