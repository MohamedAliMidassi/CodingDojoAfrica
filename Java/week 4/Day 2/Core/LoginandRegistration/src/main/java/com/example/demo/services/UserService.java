package com.example.demo.services;


import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.example.demo.models.LoginUser;
import com.example.demo.models.User;
import com.example.demo.repositories.UserRespository;



@Service 
public class UserService {
	
	@Autowired
	private UserRespository userRepo;
	
	public User register(User newUser, BindingResult result) {
		Optional<User> opUser = userRepo.findByEmail(newUser.getEmail());
		if(opUser.isPresent()) {
			result.rejectValue("email", "registerErrors", "Email is already taken!");
		}
		if(!newUser.getPassword().equals(newUser.getConfirmPassword())) {
			result.rejectValue("confirmPassword", "registerErrors", "Password does not match!");
		}
		if(result.hasErrors()) {
			return null;
		}else {
			newUser.setPassword(BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt()));
			return userRepo.save(newUser);
		}
	}

	public User login(LoginUser newLoginUser, BindingResult result) {
		Optional<User> opUser = userRepo.findByEmail(newLoginUser.getEmail());
		if(!opUser.isPresent()) {
			result.rejectValue("email", "loginErrors", "Invalid credentials!");
		}else {
			User user= opUser.get();
			//check the password
			if(!BCrypt.checkpw(newLoginUser.getPassword(), user.getPassword())) {
				result.rejectValue("password", "loginErrors", "Invalid credentials!");
			}
			if(result.hasErrors()) {
				return null;
			}else {
				return user;
			}
			
		}
		return null;
	}
	
	public User findUserById(Long id) {
		Optional<User> maybeUser = userRepo.findById(id);
		if(maybeUser.isPresent()) {
			return maybeUser.get();
		}else {
			return null;
		}
	}
	
	
	
	
}
