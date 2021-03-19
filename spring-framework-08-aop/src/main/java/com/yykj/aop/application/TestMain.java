package com.yykj.aop.application;

import com.yykj.aop.service.IUserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * AOP切面编程实现
 * 一、实现内容：
 * 1. 实现使用Spring-Api完成AOP
 * 2. 实现自定义AOP
 * 3. 实现注解方式实现AOP
 * 二、注解总结
 * 1. @Aspect: 标注切面类
 * 2. @Before: 标注前置方法
 * 3. @After: 标注后置方法
 * 4. @Around: 标注环绕方法
 */
public class TestMain {

    public static void main(String[] args) {

        // TODO: 1. AOP: Spring-API实现
        //aopSpringAPI();

        // TODO: 2. 自定义实现AOP
        //aopSelfAPI();

        // TODO: 3. 注解实现AOP
        aopAnnotationAPI();
    }

    /**
     * AOP: Spring-API实现
     */
    public static void aopSpringAPI(){
        // TODO: AOP可以代理接口及类 但一般都会代理接口
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IUserService service = (IUserService)context.getBean("userService");
        service.select();
    }

    /**
     * AOP: 自定义实现AOP
     */
    public static void aopSelfAPI(){
        // TODO: AOP可以代理接口及类 但一般都会代理接口
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
        IUserService service = (IUserService) context.getBean("userService");
        service.select();
    }

    /**
     * AOP: 注解实现AOP
     */
    public static void aopAnnotationAPI(){
        // TODO: AOP可以代理接口及类 但一般都会代理接口
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");
        IUserService service = (IUserService) context.getBean("userService");
        service.select();
    }
}
