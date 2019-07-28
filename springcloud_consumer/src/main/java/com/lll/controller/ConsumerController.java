package com.lll.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

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
    RestTemplate restTemplate;

    public String helloConsumer() {
        return restTemplate.getForEntity("http://provider/hello/hello", String.class).getBody();
    }
}
