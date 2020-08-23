package com.jyk;

import com.jyk.entity.UserAddress;
import com.jyk.service.OrderService;
import com.jyk.service.SayHello;
import com.jyk.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @Classname Test
 * @Description TODO
 * @Date 2020/8/22 12:33
 * @Created by JYK
 */
public class Test {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
//        context.start();
        SayHello sayHello = (SayHello) context.getBean("sayHello");
        System.out.println("asas");
        String wangming = sayHello.hello("wangming");
        System.out.println(wangming);
        OrderService orderService = context.getBean(OrderService.class);
        orderService.orderInit("1");
        System.in.read();
    }
}
