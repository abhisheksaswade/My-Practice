package com.app.dto;

public class AuthenticationDto {
	
	private String Email;
	private String Password;
	
	
	
	
	public AuthenticationDto() {
		super();
	}

	public AuthenticationDto(String email, String password) {
		super();
		Email = email;
		Password = password;
	}
	
	
	
	
	@Override
	public String toString() {
		return "AuthenticationDto [Email=" + Email + "]";
	}

	
	
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	

}
