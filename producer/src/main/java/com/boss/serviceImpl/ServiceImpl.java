package com.boss.serviceImpl;


import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author jrf
 * @date 2023-1-16 13:25
 */
@DubboService
public class ServiceImpl implements Service{

    @Override
    public String getName() {
        return "测试";
    }
}
