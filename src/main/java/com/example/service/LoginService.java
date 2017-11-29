package com.example.service;

import com.example.dao.LoginDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("loginService")
@Transactional
public class LoginService {

    @Autowired
    private LoginDao loginDao;


    public boolean login(String username ,String password){
        return  loginDao.login(username, password);

    }
}
