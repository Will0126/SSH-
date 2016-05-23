package com.kaishengit.dao;

import com.kaishengit.pojo.Movie;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
public class MovieDao extends BaseDao<Movie> {

    //事务已经交给spring管理，spring基于注解做

    public List<Movie> findAll(){
        Criteria criteria = getSession().createCriteria(Movie.class);
        //排序，限制每页数量
        criteria.addOrder(Order.desc("id"));
        criteria.setFirstResult(0);
        criteria.setMaxResults(10);
        return criteria.list();
    }


    public void del(Integer id) {
        Movie movie = findById(id);
        getSession().delete(movie);
    }
}
