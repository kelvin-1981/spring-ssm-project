package com.yykj.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DataQueryProxy implements InvocationHandler {

    private IDataDao dataDao;

    public void setDataDao(IDataDao dataDao) {
        this.dataDao = dataDao;
    }

    public DataQueryProxy() {

    }

    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), dataDao.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        openConection();
        Object invoke = method.invoke(dataDao, args);
        closeConnection();
        return invoke;
    }

    private void openConection(){
        System.out.println("connection open...");
    }

    private void closeConnection(){
        System.out.println("connection close ....");
    }
}
