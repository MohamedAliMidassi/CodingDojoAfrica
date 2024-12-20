package com.example.demo.repositories;


import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.User;

public interface UserRespository extends CrudRepository<User, Long> {
	Optional<User>findByEmail(String email);
}
