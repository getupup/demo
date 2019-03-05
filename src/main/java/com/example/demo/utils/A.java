package com.example.demo.utils;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

/**
 * @Author: fwb
 * @Date: 2019/2/27  19:15
 */
@Configuration
public class A {

    public Integer value;

    @Bean
    public B getB(){
        B b = new B(18);
        return b;
    }
}
