package com.arya.bookshelf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.arya.bookshelf.entity.Book;
import com.arya.bookshelf.service.BookService;

@Controller
public class BookController {

    @Autowired
    private BookService service;
    
    @GetMapping("/")
    public ModelAndView home(){
        return new ModelAndView("home");
    }

    @GetMapping("/add_book")
    public String addBook(){
        return "addBook";
    }

    @GetMapping("/all_books")
    public String getAllBooks(){
        return "bookList";
    }

    @PostMapping("/save")
    public String addBook(@ModelAttribute Book b){
        service.save(b);
        return "redirect:/all_books";
    }
}
