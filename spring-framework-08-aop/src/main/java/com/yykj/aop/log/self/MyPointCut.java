package com.yykj.aop.log.self;

public class MyPointCut {

    public void before(){
        System.out.println("before ...");
    }

    public void after(){
        System.out.println("after");
    }

}
