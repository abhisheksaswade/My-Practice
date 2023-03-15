package com.app.pojos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class User {
	
//data member	
	@Column(length=20)
	private String name;
	
	@Column(length=20)
	private String email;
	
	@Column(length=20)
	private String password;
	
	@Column(length=20)
	private String type;
	
	
	
//constructor
	public User() {
		super();
	}


	public User(String name, String email, String password, String type) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.type = type;
	}


//Tostring
	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", type=" + type + "]";
	}


//getters & setters	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}
	
}
