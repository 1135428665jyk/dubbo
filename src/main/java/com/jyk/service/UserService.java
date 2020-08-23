package com.jyk.service;

import com.jyk.entity.UserAddress;

import java.util.List;

/**
 * @Classname UserService
 * @Description TODO
 * @Date 2020/8/22 7:02
 * @Created by JYK
 */
public interface UserService {
    public List<UserAddress> getUserAddressList(String userId);
}
