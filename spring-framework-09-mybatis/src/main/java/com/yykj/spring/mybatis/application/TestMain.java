package com.yykj.spring.mybatis.application;

import com.yykj.spring.mybatis.bean.User;
import com.yykj.spring.mybatis.dao.UserDao;
import com.yykj.spring.mybatis.dao.UserDao2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.List;


/**
 * Spring-Mybatis 集成
 * 一、实现内容：
 * 1. 集成方法1：生成sqlSession实现
 * 2. 集成方法2：集成SqlSessionDaoSupport实现
 */
public class TestMain {

    public static void main(String[] args) {

        // TODO: 1.Spring-Mybatis继承方式 1
        //springMybatis();
        // TODO: 2.Spring-Mybatis继承方式 2
        springMybatis02();
    }

    /**
     * Spring-Mybatis继承方式 1
     */
    public static void springMybatis(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = context.getBean("userDao", UserDao.class);
        List<User> users = userDao.getUserList();

        for(User info: users){
            System.out.println(info.toString());
        }
    }

    /**
     * Spring-Mybatis继承方式 2
     */
    public static void springMybatis02(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
        UserDao2 userDao2 = context.getBean("userDao2", UserDao2.class);
        List<User> users = userDao2.getUserList();

        for(User info: users){
            System.out.println(info.toString());
        }
    }
}
