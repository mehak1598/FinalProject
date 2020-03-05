package com.aciworldwide.BEC.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aciworldwide.BEC.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}
