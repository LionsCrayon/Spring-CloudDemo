package com.example.hello.spring.cloud.web.admin.ribbon.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @version v1.0
 * @ProjectName: hello-spring-cloud
 * @ClassName: AdminService
 * @Description: TODO(一句话描述该类的功能)
 * @Author: 89695
 * @Date: 2020/4/12 12:48
 */
@Service
public class AdminService {

    @Autowired
    public RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String sayHi(String message)
    {
        return restTemplate.getForObject("http://HELLO-SPRING-CLOUD-SERVICE-ADMIN/Hi?message="+message,String.class);
    }

    public String hiError(String message)
    {
        return String.format("Hi you message is %s but request error",message);
    }
}
