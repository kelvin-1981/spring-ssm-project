package com.yykj.mybatis.common;

import com.yykj.mybatis.bean.User;

import java.util.List;
import java.util.Map;

public interface IUserDao {

    public List<User> getUserList();

    public User getUserByID(int id);

    public int insertUser(User user);

    public int insertUser02(Map map);

    public int updateUser(User user);

    public int deleteUser(int id);
}
