package com.lll.config;

import com.netflix.loadbalancer.AvailabilityFilteringRule;
import com.netflix.loadbalancer.IRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author Liu Lele
 * @Date 2019/8/7 11:18
 **/
@Configuration
public class ConfigBean {
    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    /**
     * Ribbon自带有7种负载均衡的算法，默认是轮询，也可以自定义负载均衡算法
     * RandomRule   随机
     * RoundRobinRule   轮询
     * AvailabilityFilteringRule    过滤掉多次访问故障的服务和并发的连接数超过阈值的服务，剩下的服务按照轮询策略
     * WeightedResponseTimeRule     根据平均响应时间计算所有服务的权重，响应时间越快服务权重越大
     * BestAvailableRule	会先过滤掉由于多次访问故障二处于断路器跳闸状态的服务，然后选择一个并发量最小的服务
     *
     * @return
     */
    @Bean
    IRule iRule() {
        return new AvailabilityFilteringRule();
    }
}
