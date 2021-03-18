package com.yykj.spring.dao;

public class UserOracleDao implements IUserDao{
    @Override
    public void show() {
        System.out.println("Oracle...");
    }
}
