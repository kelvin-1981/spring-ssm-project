package com.yykj.config.application;

import com.yykj.config.bean.User;
import com.yykj.config.config.BeanConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Spring使用注释开发
 * 一、实现内容：
 * 1.使用config实现配置 完全舍弃beans.xml
 * 二、注解总结
 * 1. @Configuration: 装载config类 @Component泛型
 * 2. @ComponentScan: 指定config装载内容扫描位置
 * 3. @Bean: 指定config中获取对象方法，AnnotationApplicationContext可以获取实例
 */
public class TestMain {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        User user = context.getBean("user", User.class);
        System.out.println(user.toString());
        System.out.println("----------------------------------------");
        Object person = context.getBean("person");
        System.out.println(person.toString());
    }
}
