package com.yykj.spring.service;

import com.yykj.spring.dao.IUserDao;

public class UserService implements IUserService{

    private IUserDao userDao;

    public IUserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(IUserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void show() {
        userDao.show();
    }
}
