package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: fwb
 * @Date: 2019/2/26  14:54
 */

@Controller
@RequestMapping("/user")
public class UserController {

    private static Logger LOG = LoggerFactory.getLogger(UserController.class);

    @Autowired
    UserService userService;

    @RequestMapping("/toRegister")
    public String toRegister(){
        return "register";
    }

    @RequestMapping("/toLogin")
    public String toLogin(){
        return "login";
    }

    @RequestMapping("toWelcome")
    public String toWelcome(){
        return "welcome";
    }

    @RequestMapping("/register")
    public String register(String name, String password, HttpServletRequest request){
        int result = this.userService.register(name, password);

        if (result == 0){
            request.setAttribute("msg", "注册失败");
            return "error";
        }
        else {
            return "login";
        }
    }

    @RequestMapping("/login")
    public String login(String name, String password, HttpServletRequest request){

        User resultUser = this.userService.login(name, password);

        if (resultUser == null){
            request.setAttribute("msg", "账号或密码错误");
            return "error";
        }
        else {
            request.getSession().setAttribute("user", resultUser);
            return "welcome";
        }

    }

    @RequestMapping("/logout")
    public void logout(HttpServletRequest request, HttpServletResponse response){

        request.getSession().removeAttribute("user");
        try {
            response.sendRedirect("/user/toLogin");
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
