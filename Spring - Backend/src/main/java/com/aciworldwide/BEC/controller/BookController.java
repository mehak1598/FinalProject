package com.aciworldwide.BEC.controller;

import java.io.Console;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aciworldwide.BEC.model.Book;
import com.aciworldwide.BEC.service.BookService;

@RestController
@RequestMapping("/books")
@CrossOrigin(origins = "http://localhost:4200")
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@GetMapping("/all")
	public List<Book> getBooks(){
		return bookService.getBooks();
	}


	@GetMapping("/{id}")
	public Book getBook(@PathVariable Long id){
	return bookService.getBook(id);

	}

	@PostMapping("/insert")
	public Book insertBook(@RequestBody Book book){
		System.out.println("In here");
	return bookService.insertBook(book);

	}

	@DeleteMapping("/delete/{id}")
	public void deleteBook(@PathVariable("id") Long id){
	bookService.deleteBook(id);

	}
	
	@PutMapping("/update/{id}")
	public void updateBook(@RequestBody Book book){
		System.out.println("Inside update function");
	bookService.updateBook(book);

	}

}
