package com.training.Constructor;


public class Book_Class {

    // 🔹 Fields
    private String title;
    private String author;
    private String isbn;
    private double price;

    // 🔹 Default Constructor
    public Book_Class() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.isbn = "0000";
        this.price = 0.0;
    }

    // 🔹 Parameterized Constructor
    public Book_Class(String title, String author, String isbn, double price) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.price = price;
    }

    // 🔹 Copy Constructor
    public Book_Class(Book_Class other) {
        this.title = other.title;
        this.author = other.author;
        this.isbn = other.isbn;
        this.price = other.price;
    }

    // 🔹 Overloaded Constructor
    public Book_Class(String title, String author) {
        this.title = title;
        this.author = author;
        this.isbn = "Not Assigned";
        this.price = 0.0;
    }

    // 🔹 Getters
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getIsbn() { return isbn; }
    public double getPrice() { return price; }

    // 🔹 toString()
    @Override
    public String toString() {
        return "Book Details:\n" +
               "Title: " + title + "\n" +
               "Author: " + author + "\n" +
               "ISBN: " + isbn + "\n" +
               "Price: ₹" + price + "\n";
    }

    // 🔹 MAIN METHOD (Test inside same class)
    public static void main(String[] args) {

        // Default constructor
        Book_Class b1 = new Book_Class();

        // Parameterized constructor
        Book_Class b2 = new Book_Class("Java Programming", "James Gosling", "1111", 599.99);

        // Copy constructor
        Book_Class b3 = new Book_Class (b2);

        // Overloaded constructor
        Book_Class b4 = new Book_Class("Python Basics", "Guido van Rossum");

        // Print all
        System.out.println("----- Book 1 -----");
        System.out.println(b1);

        System.out.println("----- Book 2 -----");
        System.out.println(b2);

        System.out.println("----- Book 3 (Copy) -----");
        System.out.println(b3);

        System.out.println("----- Book 4 -----");
        System.out.println(b4);
    }
}