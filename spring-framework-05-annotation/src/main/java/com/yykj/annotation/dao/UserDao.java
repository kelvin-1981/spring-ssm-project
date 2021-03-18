package com.yykj.annotation.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

    public void show(){
        System.out.println("This is spring annotation case ...");
    }
}
