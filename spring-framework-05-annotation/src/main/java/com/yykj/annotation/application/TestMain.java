package com.yykj.annotation.application;

import com.yykj.annotation.bean.User;
import com.yykj.annotation.controller.UserContoller;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Spring使用注释开发
 * 一、实现内容：
 * 1.注解实现类及属性注册至容器
 * 2.注解实现开发框架注册 & 自动装载
 * 二、注解总结
 * 0. <context:annotation-config/>
 * 0. <context:component-scan base-package="com.yykj.annotation.bean"/>
 * 1. @Component:将某个类注册到容器中 相当于xml:<bean id="user" class="com.yykj.annotation.bean.User"/>
 * 2. @Value：属性赋值 相当于xml:<property name="name" value="tony"/>
 * 3. @Repository: 将Dao层类注册到容器中(@Component衍生)
 * 4. @Service: 将Service层类注册到容器中(@Component衍生)
 * 5. @Controller: 将Controller层类注册到容器中(@Component衍生)
 * 6. @Scope: 作用域 原型、单例模式等
 */
public class TestMain {

    public static void main(String[] args) {

        // TODO: 1.注解实现类及属性注册至容器
        //springAnnotation();

        // TODO: 2.注解实现开发框架注册 & 自动装载
        springAnnotation02();
    }

    /**
     * 1.注解实现类及属性注册至容器
     */
    public static void springAnnotation(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user.toString());
    }

    /**
     * TODO: 2.注解实现开发框架注册 & 自动装载
     */
    public static void springAnnotation02(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserContoller bean = context.getBean("userContoller", UserContoller.class);
        bean.show();
    }
}
