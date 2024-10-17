package com.codingdojo.demo;

public class Mammal {
	
	
	int energy;

	public Mammal(int energy) {
		super();
		this.energy=energy;
	}
	
	public String displayEnergy() {
		
		return"Energy: " + this.energy;
	}
	
	
}
