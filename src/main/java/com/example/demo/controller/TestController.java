package com.example.demo.controller;

import com.example.demo.utils.A;
import com.example.demo.utils.B;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: fwb
 * @Date: 2019/3/1  11:30
 */
@RestController
@RequestMapping("/aa")
public class TestController {

    @Autowired
    private B test;

    @RequestMapping("/show")
    public String show(){
        return test.value.toString() + test.getClass();
    }

}
