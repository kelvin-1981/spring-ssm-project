package com.yykj.spring.dao;

public class UserMysqlDao implements IUserDao{
    @Override
    public void show() {
        System.out.println("Mysql...");
    }
}
