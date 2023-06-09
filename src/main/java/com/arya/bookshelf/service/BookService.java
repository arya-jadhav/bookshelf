package com.arya.bookshelf.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arya.bookshelf.entity.Book;
import com.arya.bookshelf.repository.BookRepository;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepo;
    public void save(Book b){
        bookRepo.save(b);
    }
}
