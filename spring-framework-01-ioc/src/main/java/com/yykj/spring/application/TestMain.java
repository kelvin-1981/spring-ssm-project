package com.yykj.spring.application;

import com.yykj.spring.bean.User;
import com.yykj.spring.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * IOC：控制反转,具体负责对象实例化(new)
 * 一、实现内容
 * 1.实现IOC方式获取对象(xml方式)
 * 2.实现IOC方式实现分层调用(xml方式)
 * 二、实现流程
 * 1 pom.xml 导入spring依赖及xml文件打包配置
 * 2 创建User类
 * 3 创建beans.xml配置文件（官方名称：applicationContext.xml）
 * 4 创建TestMain调用显示
 */
public class TestMain {

    public static void main(String[] args) {

        // TODO: 1.IOC获取对象
        //springIocTest();

        // TODO: 2.IOC方式实现分层调用
        springIocTest02();
    }

    /**
     * IOC获取对象
     */
    public static void springIocTest(){
        // TODO: 1.IOC获取去对象
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user = (User) context.getBean("user");
        System.out.println(user.toString());
    }

    /**
     * Ioc方式实现分层调用
     */
    public static void springIocTest02(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserService service = (UserService) context.getBean("userService");
        service.show();
    }
}
