package com.example.hello.spring.cloud.web.admin.feign.Service.hystrix;

import com.example.hello.spring.cloud.web.admin.feign.Service.AdminService;
import org.springframework.stereotype.Component;

/**
 * @version v1.0
 * @ProjectName: hello-spring-cloud
 * @ClassName: AdminServiceHystrix
 * @Description: TODO(一句话描述该类的功能)
 * @Author: 89695
 * @Date: 2020/4/12 15:45
 */
@Component
public class AdminServiceHystrix implements AdminService {
    @Override
    public String sayHi(String message) {
        return "Hi you message is \""+message+"\" but request error";
    }
}
