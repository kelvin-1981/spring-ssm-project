package com.yykj.annotation.controller;

import com.yykj.annotation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserContoller {

    @Autowired
    private UserService userService;

    public void show(){
        userService.show();
    }
}
