package com.yykj.transcation.application;

import com.yykj.transcation.bean.User;
import com.yykj.transcation.dao.IUserDao;
import com.yykj.transcation.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.List;

/**
 * Spring-Mybatis集成实现事务
 * 一、实现内容：
 * 1. Spring-Mybatis集成实现事务
 * 二、注解总结
 * 1. @Data: 标注后省略Set/Get方法
 * 2. @AllArgsConstructor: 标注后省略类的全参构造方法
 * 3. @NoArgsConstructor: 标注后省略类的无参构造方法
 */
public class TestMain {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IUserDao userDao = context.getBean("userDao", IUserDao.class);
        List<User> users = userDao.transcationUser();

        for(User info: users){
            System.out.println(info.toString());
        }
    }
}
