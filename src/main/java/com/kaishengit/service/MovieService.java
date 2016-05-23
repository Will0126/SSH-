package com.kaishengit.service;

import com.kaishengit.dao.MovieDao;
import com.kaishengit.pojo.Movie;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
@Transactional
public class MovieService {
    //@Transactional开启事务

    @Inject
    private MovieDao movieDao;

    //只读事务
    @Transactional(readOnly = true)
    public List<Movie> findAllMovie(){
        return movieDao.findAll();
    }

    public void saveNewMovie(Movie movie) {
        movieDao.save(movie);
    }

    public Movie findById(Integer id) {
        return movieDao.findById(id);
    }

    public void updateMovie(Movie movie) {
        movieDao.save(movie);
    }

    public void del(Integer id) {
        movieDao.del(id);
    }
}
