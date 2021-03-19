package com.yykj.spring.mybatis.dao;

import com.yykj.spring.mybatis.bean.User;

import java.util.List;

public interface IUserDao {

    public List<User> getUserList();
}
