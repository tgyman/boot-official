package com.tgy.entity;

/**
 * 用户类
 */
public class User {
    private String userName;//用户姓名
    private int age;//年龄
    private String address;//家庭住址,用户2

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
