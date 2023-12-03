package com.moviemanage.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "movies")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String title;
    int year;
    BigDecimal revenue;
    String genre;
    String description;
    String director;
    String actors;
    int runtime;
    double rating;
    int votes;
    int metascore;

    public Movie(long id, String title, int year, BigDecimal revenue, String genre, String description, String director, String actors, int runtime, double rating, int votes, int metascore) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.revenue = revenue;
        this.genre = genre;
        this.description = description;
        this.director = director;
        this.actors = actors;
        this.runtime = runtime;
        this.rating = rating;
        this.votes = votes;
        this.metascore = metascore;
    }

    public Movie() {
        super();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public BigDecimal getRevenue() {
        return revenue;
    }

    public void setRevenue(BigDecimal revenue) {
        this.revenue = revenue;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getVotes() {
        return votes;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }

    public int getMetascore() {
        return metascore;
    }

    public void setMetascore(int metascore) {
        this.metascore = metascore;
    }
}
