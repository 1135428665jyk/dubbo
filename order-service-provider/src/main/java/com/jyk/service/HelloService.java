package com.jyk.service;

/**
 * @Classname HelloService
 * @Description TODO
 * @Date 2020/8/22 16:41
 * @Created by JYK
 */
public class HelloService implements SayHello {
    @Override
    public String hello(String name) {
        return "hello world" +name;
    }
}
