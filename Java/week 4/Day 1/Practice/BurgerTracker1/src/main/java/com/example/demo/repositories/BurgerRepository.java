package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.Burger;

public interface BurgerRepository extends CrudRepository<Burger, Long> {

	
	List<Burger> findAll();
	
	
}
