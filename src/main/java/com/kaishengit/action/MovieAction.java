package com.kaishengit.action;

import com.kaishengit.pojo.Movie;
import com.kaishengit.service.MovieService;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import javax.inject.Inject;
import java.util.List;

@Namespace("/movie")
public class MovieAction {

    @Inject
    private MovieService movieService;

    private Movie movie;
    private Integer id;

    private List<Movie> movieList;


    @Action("home")
    public String home(){
        movieList = movieService.findAllMovie();
        System.out.println(movieList.isEmpty());
        return "success";
    }

    @Action("add")
    public String add(){
        return "success";
    }

    @Action(value = "save",results = {
            @Result(name = "success",type = "redirectAction",
            params = {
                    "actionName","home",
                    "namespace","/movie"
            })
    })
    public String save(){
        movieService.saveNewMovie(movie);
        return "success";
    }

    @Action("edit")
    public String edit(){
        movie = movieService.findById(id);
        return "success";
    }

    @Action(value = "update",results = {
            @Result(name = "success",type = "redirectAction",params = {
                    "actionName","home",
                    "namespace","/movie"
            })
    })
    public String update(){
        movieService.updateMovie(movie);
        return "success";
    }

    @Action(value = "del",results = {
            @Result(name = "success",type = "redirectAction",params = {
                    "actionName","home",
                    "namespace","/movie"
            })
    })
    public String del(){
        movieService.del(id);
        return "success";
    }

    public List<Movie> getMovieList() {
        return movieList;
    }

    public void setMovieList(List<Movie> movieList) {
        this.movieList = movieList;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
