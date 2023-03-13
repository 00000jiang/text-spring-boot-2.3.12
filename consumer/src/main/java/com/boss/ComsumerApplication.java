package com.boss;

import com.alibaba.cloud.nacos.ribbon.NacosRule;
import com.netflix.loadbalancer.IRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

/**
 * @author hc
 * @date 2023-1-16 16:45
 */

@SpringBootApplication
@EnableDiscoveryClient
public class ComsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ComsumerApplication.class,args);
    }

    /**
     * 结合Nacos后台权重设置的策略
     * @return
     */
    @Bean
    public IRule loadBalanceRule(){
        return new NacosRule();
    }
}
