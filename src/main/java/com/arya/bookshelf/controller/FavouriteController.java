package com.arya.bookshelf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.arya.bookshelf.service.FavouritesListService;

@Controller
public class FavouriteController {
    
    @Autowired
    private FavouritesListService favService;

    @RequestMapping("/deleteFavourite/{id}")
    public String deleteFavourite(@PathVariable("id") int id){
        favService.deleteById(id);
        return "redirect:/favourites";
    }
}
