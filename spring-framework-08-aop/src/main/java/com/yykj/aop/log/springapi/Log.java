package com.yykj.aop.log.springapi;

import org.springframework.aop.MethodBeforeAdvice;
import java.lang.reflect.Method;

public class Log implements MethodBeforeAdvice {

    /**
     * 前置代理
     * @param method：执行的方法
     * @param args：参数(objects)
     * @param target:目标对象(o)
     * @throws Throwable
     */
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println(target.getClass().getName() + "的" + method.getName() + "方法执行!");
    }
}
