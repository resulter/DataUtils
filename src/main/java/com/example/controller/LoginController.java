package com.example.controller;

import com.example.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


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
            return "forward:getBSArea";
        }else {
            return "loginError";
        }
    }
}
