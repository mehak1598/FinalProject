package com.aciworldwide.BEC.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aciworldwide.BEC.model.Book;
import com.aciworldwide.BEC.repository.BookRepository;

@Service
public class BookService {
	
	@Autowired
	public BookRepository repository;
	
	//create
		public Book putBook(Book b)
		{
			return repository.saveAndFlush(b);
		}
	
	//read - all
	public List<Book> getBooks(){
		return repository.findAll();
	}

	//read - one
	public Book getBook(Long id) {
		return repository.findById(id).get();
	}

	//update
	public Book updateBook(Book b)
	{
		repository.delete(b);
		return repository.saveAndFlush(b);
	}

	//delete
	public void deleteBook(Long id)
	{
		repository.deleteById(id);
	}
	
	//insert
	public Book insertBook(Book b)
	{
		return repository.saveAndFlush(b);
	}
}
