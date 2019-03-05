package com.example.demo.service;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: fwb
 * @Date: 2019/2/26  14:54
 */

@Service
public class UserService {

    @Autowired
    UserDao userDao;

    public User login(String name, String password){
        return this.userDao.login(name, password);
    }

    public int register(String name, String password) {
        return this.userDao.register(name, password);
    }
}
