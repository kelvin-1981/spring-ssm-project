package com.yykj.proxy.dynamic;

public class DataDao implements IDataDao {
    @Override
    public void executer() {
        System.out.println("query data ...");
    }
}
