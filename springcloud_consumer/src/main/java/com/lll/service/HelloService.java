package com.lll.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author Liu Lele
 * @Date 2019/7/30 11:45
 **/
@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;

    //@HystrixCommand断路由配置，当无法调用hiService方法时，就会调用自定义的hiError方法。
    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name) {
        return restTemplate.getForObject("http://provider/hello/hello?s=" + name, String.class);
    }

    public String hiError(String name) {
        return "key  " + name + "there is some problem with hi page";
    }
}
