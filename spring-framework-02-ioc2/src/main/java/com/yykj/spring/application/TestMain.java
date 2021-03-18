package com.yykj.spring.application;

import com.yykj.spring.bean.People;
import com.yykj.spring.bean.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * IOC：控制反转,具体负责对象实例化(new)
 * 一、实现内容
 * 1.IOC创建对象验证（有参及无参构造）
 * 2.别名配置
 * 二、实现流程
 * 1 pom.xml 导入spring依赖及xml文件打包配置
 * 2 创建User类
 * 3 创建beans.xml配置文件（官方名称：applicationContext.xml）
 * 4 创建TestMain调用显示
 */
public class TestMain {

    public static void main(String[] args) {

        // TODO: 1.IOC对象创建 无参构造
        //springIocTest();

        // TODO: 2.IOC对象创建 有参构造 & 别名配置
        springIocTest02();
    }

    /**
     * IOC对象创建 无参构造
     */
    public static void springIocTest(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user = (User) context.getBean("user");
        System.out.println(user.toString());
    }

    /**
     * IOC对象创建 有参构造
     */
    public static void springIocTest02(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        People people = (People) context.getBean("aliasPeople");
        System.out.println(people.toString());
    }
}
