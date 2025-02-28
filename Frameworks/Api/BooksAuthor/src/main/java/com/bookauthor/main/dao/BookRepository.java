package com.bookauthor.main.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookauthor.main.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
