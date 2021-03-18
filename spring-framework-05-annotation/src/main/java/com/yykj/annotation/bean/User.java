package com.yykj.annotation.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @Component:将类注册为Component
 * 相当于xml中 <bean id="user" class="com.yykj.annotation.bean.User"/>
 */
@Component
@Scope("prototype")
public class User {

    // @Value：注册属性值 相当于<property name="name" value="tony"/>
    @Value("tony")
    public String name;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
