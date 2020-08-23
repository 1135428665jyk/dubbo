package com.jyk.service;

import com.jyk.entity.UserAddress;
import com.jyk.service.UserService;

import java.util.Arrays;
import java.util.List;

/**
 * @Classname UserServiceImpl
 * @Description TODO
 * @Date 2020/8/22 7:04
 * @Created by JYK
 */
public class UserServiceImpl implements UserService {
    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        UserAddress address1 = new UserAddress(1,"北京市海淀区","1","张三","17824821861","0");
        UserAddress address2 = new UserAddress(2,"北京市通州区","2","李四","15542372785","0");
        return Arrays.asList(address1,address2);
    }
}
