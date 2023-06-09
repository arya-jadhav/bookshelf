package com.arya.bookshelf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arya.bookshelf.entity.FavouritesList;

@Repository
public interface FavouritesRepository extends JpaRepository<FavouritesList, Integer> {
    
}
