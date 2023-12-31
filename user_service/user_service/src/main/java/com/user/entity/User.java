package com.user.entity;

import java.util.ArrayList;
import java.util.List;

public class User {
    private Long userId;
    private String name;
    private String phone;
    private int citycode; //3 digit city code of user
    List<Contact> contacts = new ArrayList<>();


    public User(Long userId, String name, String phone, int citycode, List<Contact> contacts) {
        this.userId = userId;
        this.name = name;
        this.phone = phone;
        this.citycode = citycode;
        this.contacts = contacts;
    }

    public User(Long userId, String name, String phone, int citycode) {
        this.userId = userId;
        this.name = name;
        this.phone = phone;
        this.citycode = citycode;
    }

    public User() {
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getCitycode() {
        return citycode;
    }

    public void setCitycode(int citycode) {
        this.citycode = citycode;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }
}
