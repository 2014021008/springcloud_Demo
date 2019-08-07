package com.lll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName Application
 * @Description TODO
 * @Author Liulele
 * @Date 2019/7/2814:49
 **/
@SpringBootApplication
@EnableEurekaClient
public class ProviderApplication3 {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication3.class, args);
    }
}
