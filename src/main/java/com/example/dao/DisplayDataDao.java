package com.example.dao;

import com.example.entity.SysDict;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DisplayDataDao {

    /**
     * SessionFactory
     */
    @Autowired
    SessionFactory sessionFactory;

    /**
     * 获取 Session
     */
    public Session getSession(){
        return sessionFactory.openSession();
//        return sessionFactory.getCurrentSession();
    }


    /**
     * 返回学员对象
     *
     * @param
     * @return
     */
    public List<SysDict> getData() {
        String sql = "SELECT * FROM sys_dict;";
        Query query = getSession().createSQLQuery(sql).addEntity(SysDict.class);
        return query.list();
    }
}
