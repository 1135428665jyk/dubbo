package com.jyk.service.impl;


import com.jyk.entity.UserAddress;
import com.jyk.service.OrderService;
import com.jyk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname OrderServiceImpl
 * @Description TODO
 * @Date 2020/8/22 7:37
 * @Created by JYK
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    UserService userService;

    @Override
    public List<UserAddress> orderInit(String userId) {
        System.out.println("调用开始");
        List<UserAddress> userAddressList = userService.getUserAddressList(userId);
        for (UserAddress userAddress : userAddressList) {
            System.out.println(userAddress.getUserAddress());
        }
        return userAddressList;
    }
}
