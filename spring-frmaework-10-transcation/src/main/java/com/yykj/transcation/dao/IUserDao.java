package com.yykj.transcation.dao;

import com.yykj.transcation.bean.User;

import java.util.List;

public interface IUserDao {

    public List<User> getUserList();

    public int insertUser(User user);

    public int deleteUser(int id);

    public List<User> transcationUser();
}
