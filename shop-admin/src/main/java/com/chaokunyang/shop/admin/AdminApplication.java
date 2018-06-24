package com.chaokunyang.shop.admin;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 *
 * @author panxiang
 * @create 2017-08-24 16:43
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class AdminApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(AdminApplication.class).web(true).run(args);
    }
}
