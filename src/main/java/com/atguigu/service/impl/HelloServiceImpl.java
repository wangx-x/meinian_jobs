package com.atguigu.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.service.HelloService;


@Service(loadbalance = "random")
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {

        return "wxxnb" + name;
    }
}
