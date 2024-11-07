package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.Travel;

public interface TravelRepository extends CrudRepository<Travel, Long> {

	List<Travel> findAll();
	
}
