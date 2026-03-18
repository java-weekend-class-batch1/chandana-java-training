package com.training.service;

import com.training.model.Author;
import com.training.model.Book;

public class Main {
    public static void main(String[] args) {

        Author author = new Author("James Gosling");
        Book book = new Book("Java Programming", author);

        LibraryService service = new LibraryService();
        service.issueBook(book);

        // ❌ NOT ALLOWED:
        // Helper.log("Test"); → ERROR (not accessible)
    }
}
