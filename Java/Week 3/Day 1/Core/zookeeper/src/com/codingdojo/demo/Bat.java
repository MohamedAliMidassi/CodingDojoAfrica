package com.codingdojo.demo;

public class Bat extends Mammal{

	public Bat(int energy) {
		super(energy);
	}

	public void fly() {
		System.out.println("Bat is flying!");
		System.out.println("Energy: " + (this.energy-=50));
		System.out.println("*****************************");
	}
	
	public void eatHumans() {
		System.out.println("Bat ate Humans!");
		System.out.println("Energy: " + (this.energy+=25));
		System.out.println("*****************************");
	}
	
	public void attackTown() {
		System.out.println("Bat is attacking a town!");
		System.out.println("Energy: " + (this.energy-=100));
		System.out.println("*****************************");
	}
	
}
