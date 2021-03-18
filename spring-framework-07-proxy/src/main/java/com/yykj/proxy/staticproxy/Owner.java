package com.yykj.proxy.staticproxy;

/**
 * 房东
 */
public class Owner implements IRent{
    @Override
    public void rent() {
        System.out.println("房东出租房子...");
    }
}
