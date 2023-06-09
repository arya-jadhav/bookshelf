package com.arya.bookshelf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arya.bookshelf.entity.FavouritesList;
import com.arya.bookshelf.repository.FavouritesRepository;

@Service
public class FavouritesListService {
    
    @Autowired
    private FavouritesRepository myFavs;

    public void saveFavourite(FavouritesList fav){
        myFavs.save(fav);
    }

    public List<FavouritesList> getAllFavourites(){
        return myFavs.findAll();
    }

    public void deleteById(int id){
        myFavs.deleteById(id);
    }
}
