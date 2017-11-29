package com.example.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class LoginDao {

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
        if (username != null && password != null) {
            if (username.equals("a") && password.equals("a")) {
                return true;
            } else {
                return false;
            }
        }
        else {
            return  false;
        }
    }

}
