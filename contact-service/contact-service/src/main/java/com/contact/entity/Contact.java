package com.contact.entity;

public class Contact {
    private Long cId;
    private String email;
    private String contactName;
    private String homeAddress;
    private Long userId;

    public Contact(Long cId, String email, String contactName, String homeAddress, Long userId) {
        this.cId = cId;
        this.email = email;
        this.contactName = contactName;
        this.homeAddress = homeAddress;
        this.userId = userId;
    }

    public Contact() {
    }

    public Long getcId() {
        return cId;
    }

    public void setcId(Long cId) {
        this.cId = cId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
