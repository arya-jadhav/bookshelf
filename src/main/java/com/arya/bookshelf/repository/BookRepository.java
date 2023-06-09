package com.arya.bookshelf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arya.bookshelf.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
    
}
