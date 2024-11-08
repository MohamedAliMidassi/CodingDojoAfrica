package com.example.demo.models;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class LoginUser {
	
	@NotEmpty(message="Email must not be empty.") //the white space is not considered as a character. 
	@Email(message="Email must be valid!")
	private String email;

	@NotEmpty(message="Password must not be empty.") //the white space is not considered as a character. 
	@Size(min=8, max=200, message="Password must contain more then 8 ")
	private String password;

	public LoginUser() {
		super();
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
	
}
