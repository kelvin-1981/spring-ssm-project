package com.yykj.aop.log.springapi;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;


public class AfterLog implements AfterReturningAdvice {

    /***
     * 后置代理
     * @param returnValue: 返回值(o)
     * @param method： 代理方法
     * @param args：方法参数 objects
     * @param target: 代理对象(o1)
     * @throws Throwable
     */
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println(target.getClass().getName() + "的" + method.getName() + "方法执行!");
    }
}
