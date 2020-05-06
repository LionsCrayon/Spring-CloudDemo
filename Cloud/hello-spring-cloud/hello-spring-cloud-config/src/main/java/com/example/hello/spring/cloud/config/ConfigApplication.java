package com.example.hello.spring.cloud.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @version v1.0
 * @ProjectName: hello-spring-cloud
 * @ClassName: ConfigApplication
 * @Description: TODO(一句话描述该类的功能)
 * @Author: 89695
 * @Date: 2020/4/15 8:30
 */
@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class ConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigApplication.class,args);
    }
}
