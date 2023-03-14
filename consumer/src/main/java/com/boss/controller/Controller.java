package com.boss.controller;

import com.boss.serviceImpl.Service;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jrf
 * @date 2023-1-16 16:44
 */
@RestController
@RequestMapping("/test")
public class Controller {

    @DubboReference
    Service service;

    @GetMapping("/test")
    public String test(){
        return service.getName();
    }

}
