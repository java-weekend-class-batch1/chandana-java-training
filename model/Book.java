package com.training.model;


public class Book {
    private String title;
    private Author author;

    public Book(String title, Author author) {
        this.title = title;
        this.author = author;
    }

    public String getDetails() {
        return title + " by " + author.getName();
    }
}