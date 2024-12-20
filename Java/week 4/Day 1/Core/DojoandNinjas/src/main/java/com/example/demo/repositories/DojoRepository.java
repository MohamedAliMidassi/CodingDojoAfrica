package com.example.demo.repositories;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.Dojo;

public interface DojoRepository extends CrudRepository<Dojo, Long> {

	List<Dojo> findAll();
}