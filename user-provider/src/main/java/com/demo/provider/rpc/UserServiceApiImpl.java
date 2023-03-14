package com.demo.provider.rpc;

import com.demo.api.UserServiceApi;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService(version = "1.0.0")
public class UserServiceApiImpl implements UserServiceApi {
    @Override
    public String hello(String name) {
        System.out.println("=================== come in");
        return "hello:" + name;
    }
}
