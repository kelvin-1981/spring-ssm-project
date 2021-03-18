package com.yykj.proxy.dynamic;

/**
 * 代理分为动态代理和静态代理，是Spring AOP(切面编程)的实现基础
 * 一、实现内容：
 * 1.实现静态代理及动态代理
 */
public class TestMain {
    public static void main(String[] args) {

        DataDao dataDao = new DataDao();

        DataQueryProxy dataQueryProxy = new DataQueryProxy();
        dataQueryProxy.setDataDao(dataDao);

        IDataDao proxy = (IDataDao) dataQueryProxy.getProxy();
        proxy.executer();
    }
}
