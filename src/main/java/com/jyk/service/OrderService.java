package com.jyk.service;

import com.jyk.entity.UserAddress;

import java.util.List;

/**
 * @Classname OrderService
 * @Description TODO
 * @Date 2020/8/22 7:34
 * @Created by JYK
 */
public interface OrderService {
    public List<UserAddress>orderInit(String userId);
}
