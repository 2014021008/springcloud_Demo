package com.lll.controller;

import com.lll.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName ConsumerController
 * @Description TODO
 * @Author Liulele
 * @Date 2019/7/2817:45
 **/
@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    @Autowired
    HelloService helloService;

    @GetMapping("/hello")
    public String helloConsumer(String s) {
        return helloService.hiService(s);
    }
}
