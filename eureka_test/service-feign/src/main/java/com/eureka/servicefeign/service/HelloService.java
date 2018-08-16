package com.eureka.servicefeign.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-hi",fallback = HelloServiceImpl.class)
public interface HelloService {

    @RequestMapping(method = RequestMethod.GET, value = "/test/hi")
    public String sayHiFromFegin(@RequestParam(value = "name") String name);
}
