package com.example.demo.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @Author: fwb
 * @Date: 2019/2/27  19:15
 */
public class C {
    private static Logger LOG = LoggerFactory.getLogger(C.class);

    @Resource
    public B test;

    public void test(){
        System.out.println(test.getClass().toString() + this.test.value);
    }

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(A.class);
        A a = (A) context.getBean("test");
        System.out.println(a.value);
//         new C().test();
    }
}
