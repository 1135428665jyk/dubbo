package com.jyk.entity;

import java.io.Serializable;

/**
 * @Classname com.jyk.entity.UserAddress
 * @Description TODO
 * @Date 2020/8/22 6:59
 * @Created by JYK
 */
public class UserAddress implements Serializable {
    private Integer id;
    private String userAddress;
    private String userId;
    private String consignee;
    private String phoneNumber;
    private String isDefault;

    public UserAddress() {
        super();
    }

    public UserAddress(Integer id, String userAddress, String userId, String consignee, String phoneNumber, String isDefault) {
        super();
        this.id = id;
        this.userAddress = userAddress;
        this.userId = userId;
        this.consignee = consignee;
        this.phoneNumber = phoneNumber;
        this.isDefault = isDefault;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault;
    }
}
