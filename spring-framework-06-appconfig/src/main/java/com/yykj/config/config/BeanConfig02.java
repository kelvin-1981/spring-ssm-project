package com.yykj.config.config;

import com.yykj.config.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.yykj.config.bean")
public class BeanConfig02 {

    @Bean
    public Person person(){
        return new Person();
    }
}
