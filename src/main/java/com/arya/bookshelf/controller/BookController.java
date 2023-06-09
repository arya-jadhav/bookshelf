package com.arya.bookshelf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.arya.bookshelf.entity.Book;
import com.arya.bookshelf.entity.FavouritesList;
import com.arya.bookshelf.service.BookService;
import com.arya.bookshelf.service.FavouritesListService;

@Controller
public class BookController {

    @Autowired
    private BookService service;
    
    @Autowired
    private FavouritesListService favService;

    @GetMapping("/")
    public ModelAndView home(){
        return new ModelAndView("home");
    }

    @GetMapping("/add_book")
    public String addBook(){
        return "addBook";
    }

    @GetMapping("/all_books")
    public ModelAndView getAllBooks(){
        List<Book> bookList = service.getAllBooks();
        // ModelAndView mv = new ModelAndView();
        // mv.setViewName("bookList");
        // mv.addObject("book", bookList);
        return new ModelAndView("bookList", "book", bookList);
    }

    @PostMapping("/save")
    public String addBook(@ModelAttribute Book b){
        service.save(b);
        return "redirect:/all_books";
    }

    @GetMapping("/favourites")
    public String getFavourites(Model model){
        List<FavouritesList> favsList =  favService.getAllFavourites();
        model.addAttribute("book", favsList);
        return "favourites";
    }

    @RequestMapping("/favourites/{id}")
    public String getFavourite(@PathVariable("id") int id){
        Book b=service.getBookById(id);
        FavouritesList favList = new FavouritesList(b.getId(), b.getName(), b.getAuthor(), b.getReview());
        favService.saveFavourite(favList);
        return "redirect:/favourites";
    }
}
