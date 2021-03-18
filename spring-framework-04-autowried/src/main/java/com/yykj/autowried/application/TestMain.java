package com.yykj.autowried.application;

import com.yykj.autowried.bean.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Spring自动装配
 * 一、实现内容
 * 1.实现注解自动注入
 * 二、实现步骤
 * 1.beans.xml 文件启动自动注入<context:annotation-config/>
 * 2.beans.xml 添加需要自动注入的<bean>
 * 3.类中对象属性添加@Autowired 会自动与beans.xml中的类型(基于ByType机制)一致的bean匹配
 * 4.由于@Autowired基于ByType实现，当beans.xml有多个Type相同的Bean时会报错
 *   A.使用@Qualifier(value = "dog")配合使用，指定一个唯一的id对象
 *   B.使用@Resource(name="dog")也可以
 * 三、@Qualifier与Resource区别：
 * 1.@autowire通过byType实现，而且必须要求这个对象存在
 * 2.@resource默认通过byName实现，如果找不到，通过byType实现
 */
public class TestMain {

    public static void main(String[] args) {

        springAutowried();
    }

    public static void springAutowried(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Person person = context.getBean("person", Person.class);
        person.getCat().shot();
        person.getDog().shot();
    }
}
