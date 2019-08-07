package com.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName EuerkaApplication
 * @Description TODO
 * @Author Liulele
 * @Date 2019/7/2813:01
 **/
@SpringBootApplication
@EnableEurekaServer
public class EuerkaApplication3 {
    public static void main(String[] args) {
        SpringApplication.run(EuerkaApplication3.class, args);
    }
}
