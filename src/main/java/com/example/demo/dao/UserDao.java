package com.example.demo.dao;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

/**
 * @Author: fwb
 * @Date: 2019/2/26  14:54
 */

@Repository
public interface UserDao {

    User login(@Param("name") String name, @Param("password") String password);

    int register(@Param("name") String name, @Param("password") String password);

}
