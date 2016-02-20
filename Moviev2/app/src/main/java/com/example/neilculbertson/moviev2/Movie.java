package com.example.neilculbertson.moviev2;

/**
 * Created by neilculbertson on 2/20/16.
 */
public class Movie {
    private String [] grades= {"A", "A-", "B-", "B", "B+", "C-", "C", "C+", "D-", "D", "D+", "F"};
    private String movieTitle;
    private String movieGrade;

    public String getMovietitle(){
        return movieTitle;
    }

    public void setMovieTitle(String newMovie){
        movieTitle = newMovie;
    }

    public String getMovieGrade(){
        return movieGrade;
    }

    public void setMovieGrade(String newGrade){
        movieGrade = newGrade;
    }
}
