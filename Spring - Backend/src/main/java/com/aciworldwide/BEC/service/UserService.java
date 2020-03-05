package com.aciworldwide.BEC.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aciworldwide.BEC.model.Book;
import com.aciworldwide.BEC.model.User;
import com.aciworldwide.BEC.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired 
	private UserRepository repository;

	//business logic method implementation
	public List<User> getUsers() {
		return repository.findAll();
	}
	
	public User getUser(Long id) {
		return repository.findById(id).get();
	}
	
	public User registerUser(User u)
	{
		return repository.saveAndFlush(u);
	}
	
}
