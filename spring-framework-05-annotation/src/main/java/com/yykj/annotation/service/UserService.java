package com.yykj.annotation.service;

import com.yykj.annotation.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public void show(){
        userDao.show();
    }
}
