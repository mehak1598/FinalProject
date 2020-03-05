package com.aciworldwide.BEC.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aciworldwide.BEC.model.Book;
import com.aciworldwide.BEC.model.User;
import com.aciworldwide.BEC.service.UserService;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "http://localhost:4200")
public class LoginController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/all")
	public List<User> getUsers(){
		System.out.println("----------------------------------------------");
		return userService.getUsers();
	}
	
	@GetMapping("/{id}")
	public User getBook(@PathVariable Long id){
	return userService.getUser(id);

	}
	
	@PostMapping("/register")
	public void registerUser(@RequestBody User user) {
	userService.registerUser(user);
	}
	
}
