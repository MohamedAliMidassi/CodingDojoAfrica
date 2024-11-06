package com.example.demo.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="burgers")
public class Burger {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotEmpty(message="Name must not be empty!")
	@Size(min=5, max=15, message="Name of burger has to be between 5 and 15 characters.")
	private String name;
	
	@NotEmpty(message="Restaurant name must not be empty!")
	@Size(min=5, max=25, message="Name of the restaurant has to be between 5 and 25 characters.")
	private String location;

	@NotNull(message="Rating must not be empty!")
	@Min(value=0, message="Rating can't be below zero.")
	@Max(value=5, message="Rating can't be higher than 5.")
	private double rating;
	
	@NotEmpty
	@Size(min=0, max=200, message="Please enter a note")
	private String note;
	
	public Burger() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
	
	
	
}

