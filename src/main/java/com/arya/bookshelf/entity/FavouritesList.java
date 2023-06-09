package com.arya.bookshelf.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="favourites")
public class FavouritesList {

    @Id
    private Integer id;
    private String name;
    private String author;
    private String review;
    
    public FavouritesList(Integer id, String name, String author, String review) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.review = review;
    }

    public FavouritesList() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    
}
