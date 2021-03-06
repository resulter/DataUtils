package com.example.controller;

import com.example.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Controller
@RequestMapping("/a")
public class LoginController {


    @Autowired
    private LoginService LoginService;

    @RequestMapping("/login")
    public String login(HttpServletResponse response, HttpServletRequest request, Model model){

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        model.addAttribute("username",username);
        if(LoginService.login(username,password)){
            System.out.println("登陆成功");
            return "forward:getBSArea";
        }else {
            System.out.println("登陆失败");

            return "loginError";
        }
    }
}
