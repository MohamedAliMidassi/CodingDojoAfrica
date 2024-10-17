package com.codingdojo.demo;

public class Gorilla extends Mammal {
	
	public Gorilla(int energy) {
		super(energy);
	}

	public void throwSomething() {
		System.out.println("Gorilla threw something!");
		System.out.println("Energy: " + (this.energy-=5));
		System.out.println("*****************************");
	}
	
	public void eatBananas() {
		System.out.println("Gorilla ate Bananas!");
		System.out.println("Energy: " + (this.energy+=10));
		System.out.println("*****************************");
	}
	
	public void climb() {
		System.out.println("Gorilla is climbing!");
		System.out.println("Energy: " + (this.energy-=10));
		System.out.println("*****************************");
	}
	

}