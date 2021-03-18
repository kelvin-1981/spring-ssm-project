package com.yykj.proxy.staticproxy;

public class Customer {
    public static void main(String[] args) {

        Owner owner = new Owner();

        Proxy proxy = new Proxy(owner);
        proxy.rent();

    }
}
