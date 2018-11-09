package com.yjll.cloud.consumer.remote;

import org.springframework.stereotype.Component;

/**
 * @author: zijing
 * @date: 2018/11/9 10:11
 * @description:
 */
@Component
public class HelloRemoteHystrix implements HelloRemote {
    @Override
    public String hello(String name) {
        return name + "error";
    }
}
