package com.example.hello.spring.cloud.web.admin.feign.Service;

import com.example.hello.spring.cloud.web.admin.feign.Service.hystrix.AdminServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @version v1.0
 * @ProjectName: hello-spring-cloud
 * @ClassName: AdminService
 * @Description: TODO(一句话描述该类的功能)
 * @Author: 89695
 * @Date: 2020/4/12 13:33
 */
@FeignClient(value = "hello-spring-cloud-service-admin",fallback = AdminServiceHystrix.class)
public interface AdminService {

    @RequestMapping(value = "Hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam(value = "message")String message);
}
