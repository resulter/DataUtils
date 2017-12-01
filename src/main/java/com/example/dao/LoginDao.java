package com.example.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

@Repository
public class LoginDao {
    private  String user ;
    private  String pass ;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    /**
     * SessionFactory
     */
    @Autowired
    SessionFactory sessionFactory;

    /**
     * 获取 Session
     */
    public Session getSession() {
        return sessionFactory.openSession();
//        return sessionFactory.getCurrentSession();
    }

    public boolean login(String username, String password) {
//        System.out.println("------------------------------"+ user+ "---"+ pass);

        if (username != null && password != null) {
//            if (username.equals("admin") && password.equals("admin")) {
//                return true;
//            } else if (username.equals("root") && password.equals("root")) {
//                return true;
//            } else {
//                return false;
//            }
            if (username.equals(user) && password.equals(pass)) {
                return true;
            }  else {
                return false;
            }
        } else {
            return false;
        }
    }

}
