package com.yykj.aop.log.annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


//@Aspect: 标注切面类
@Aspect
@Component
public class AnnotationLog {

    //@Before: 标注前置方法
    @Before("execution(* com.yykj.aop.service.IUserService.*(..))")
    public void before(){
        System.out.println("before");
    }

    //@After: 标注后置方法
    @After("execution(* com.yykj.aop.service.IUserService.*(..))")
    public void after(){
        System.out.println("after...");
    }

    //@Around: 标注环绕方法
    @Around("execution(* com.yykj.aop.service.IUserService.*(..))")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("around");
        Object proceed = joinPoint.proceed();
        System.out.println("after around");
    }
}
