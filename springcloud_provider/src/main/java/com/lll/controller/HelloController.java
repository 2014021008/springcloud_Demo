package com.lll.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
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
@Api(tags = "Hello as managerment", description = "HelloController")
public class HelloController {

    @GetMapping("/hello")
    @ApiOperation("hello Interface")
    public String hello(String s) {
        return "hello" + s;
    }
}
