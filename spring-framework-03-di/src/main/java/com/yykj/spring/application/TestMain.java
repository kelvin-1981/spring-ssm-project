package com.yykj.spring.application;

import com.yykj.spring.bean.Student;
import com.yykj.spring.bean.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * IOC：控制反转,具体负责对象实例化(new)
 * 一、实现内容
 * 1.实现Di Set方式实现复杂注入
 * 2.实现第三方注入 P C
 * 二、实现流程
 * 1 pom.xml 导入spring依赖及xml文件打包配置
 * 2 创建User类
 * 3 创建beans.xml配置文件（官方名称：applicationContext.xml）
 * 4 创建TestMain调用显示
 */
public class TestMain {

    public static void main(String[] args) {

        // TODO: 1.Di Set方式实现复杂注入
        //springDiTest();

        // TODO: 2.第三方注入 P C
        springPCTest();
    }

    /**
     * Di Set方式实现复杂注入
     */
    public static void springDiTest() {
        ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) classPathXmlApplicationContext.getBean("student");
        System.out.println(student.toString());
    }

    /**
     * 第三方注入 P C
     */
    public static void springPCTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans-user.xml");
        User bean = context.getBean("user", User.class);
        System.out.println(bean.toString());
    }
}
