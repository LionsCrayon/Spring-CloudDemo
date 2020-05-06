package com.example.hello.spring.cloud.service.admin.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version v1.0
 * @ProjectName: hello-spring-cloud
 * @ClassName: AdminController
 * @Description: TODO(一句话描述该类的功能)
 * @Author: 89695
 * @Date: 2020/4/4 16:58
 */
@RestController
public class AdminController {

    @Value("${server.port}")
    private String port;

    @RequestMapping(value = "Hi",method = RequestMethod.GET)
    public String sayHi(String message)
    {
        return String.format("Hi,you message is %s and port is %s",message,port);
    }
}
