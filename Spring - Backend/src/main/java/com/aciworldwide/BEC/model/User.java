package com.aciworldwide.BEC.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {
	
	private Long id;
	private String username;
	private String password;
	private String email;
	private String isadmin;
	
	
	public User() {
		super();
	}


	public User(Long id, String username, String password, String email, String isadmin) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.isadmin = isadmin;
	}

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}

	
	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getIsadmin() {
		return isadmin;
	}


	public void setIsadmin(String isadmin) {
		this.isadmin = isadmin;
	}
	
	
	
	

}
