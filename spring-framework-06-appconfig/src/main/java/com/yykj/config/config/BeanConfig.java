package com.yykj.config.config;

import com.yykj.config.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.yykj.config.bean")
@Import(BeanConfig02.class)
public class BeanConfig {

    @Bean
    public User user(){
        return new User();
    }
}
