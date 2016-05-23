package com.kaishengit.dao;

import com.kaishengit.pojo.Movie;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.inject.Inject;
import java.io.Serializable;

public abstract class BaseDao<T,PK extends Serializable> {

    //注入SessionFactory
    @Inject
    private SessionFactory sessionFactory;
    //获取Session
    public Session getSession(){
        return sessionFactory.getCurrentSession();
    }

    //保存
    public void save(T entity){
        //被保存的类必须是pojo类，所以把类可以写成泛型
        getSession().saveOrUpdate(entity);
    }

    public T findById(PK id) {
        //1、参数类型不能固定，应为主键策略可以是UUID，所以可以在声明一个泛型
        //并且该泛型，继承或者叫实现一个可序列化
        //2、获取泛型T的class
        //
        return null;
    }



}
