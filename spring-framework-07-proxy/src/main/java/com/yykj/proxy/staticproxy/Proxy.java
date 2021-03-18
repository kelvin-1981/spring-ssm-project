package com.yykj.proxy.staticproxy;

public class Proxy {

    private Owner owner;

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }


    public Proxy(Owner owner) {
        this.owner = owner;
    }

    public void rent(){
        seeHouse();
        owner.rent();
        sign();
        fare();
    }

    /**
     * 看房方法
     */
    private void seeHouse(){
        System.out.println("看房...");
    }

    /**
     * 收费方法
     */
    private void fare(){
        System.out.println("收取中介费...");
    }

    /**
     * 签约
     */
    private void sign(){
        System.out.println("签署租赁合同...");
    }
}
