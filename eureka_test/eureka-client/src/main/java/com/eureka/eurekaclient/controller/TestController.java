package com.eureka.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @Value("${server.port}")
    String port;

    @RequestMapping("/hi")
    public String home (@RequestParam(value = "name",defaultValue = "cwj")String name){
        return "port:"+port+",name:"+name;

    }
}
