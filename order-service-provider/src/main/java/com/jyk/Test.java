package com.jyk;

import com.jyk.service.SayHello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @Classname Test
 * @Description TODO
 * @Date 2020/8/22 7:54
 * @Created by JYK
 */
public class Test {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("provider.xml");
        context.start();
        System.in.read();
    }
}
