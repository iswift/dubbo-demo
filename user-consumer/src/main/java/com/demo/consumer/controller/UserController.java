package com.demo.consumer.controller;


import com.demo.api.UserServiceApi;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @DubboReference(version = "1.0.0")
    private UserServiceApi userServiceApi;

    @GetMapping("/user/consumer")
    public String hell() {
        return userServiceApi.hello("xxx");
    }
}
