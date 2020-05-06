package com.example.hello.spring.cloud.web.admin.feign.Controller;

import com.example.hello.spring.cloud.web.admin.feign.Service.AdminService;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version v1.0
 * @ProjectName: hello-spring-cloud
 * @ClassName: AdminController
 * @Description: TODO(一句话描述该类的功能)
 * @Author: 89695
 * @Date: 2020/4/12 13:36
 */
@RestController
public class AdminController {

    @Autowired
    public AdminService adminService;

    @RequestMapping(value = "Hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam String message)
    {
        return adminService.sayHi(message);
    }
}
