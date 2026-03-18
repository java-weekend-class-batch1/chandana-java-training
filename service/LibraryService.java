package com.training.service;

import com.training.model.Book;

public class LibraryService {

    public void issueBook(Book book) {
        // Using package-private helper (allowed in same package)
        Helper.log("Issuing book: " + book.getDetails());
    }
}
