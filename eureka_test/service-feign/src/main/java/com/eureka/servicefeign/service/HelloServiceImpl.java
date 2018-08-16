package com.eureka.servicefeign.service;

import org.springframework.stereotype.Component;

@Component
public class HelloServiceImpl implements HelloService {


    @Override
    public String sayHiFromFegin(String name) {
        return "sorry,"+name;
    }
}
