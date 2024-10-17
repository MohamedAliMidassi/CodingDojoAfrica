package com.codingdojo.demo;


public class MammalTest {

	public static void main(String[] args) {
		Gorilla gorilla = new Gorilla(100);
		System.out.println("---------Gorilla Report-----------");
		gorilla.throwSomething();
		gorilla.throwSomething();
		gorilla.throwSomething();
		gorilla.eatBananas();
		gorilla.eatBananas();
		gorilla.climb();
		
		System.out.println("The Gorilla's energy is at: " + gorilla.displayEnergy());
		System.out.println("*****************************");
		System.out.println("---------Bat Report-----------");
		Bat bat = new Bat(300);
		
		bat.attackTown();
		bat.attackTown();
		bat.attackTown();
		bat.eatHumans();
		bat.eatHumans();
		bat.fly();
		bat.fly();
		
		bat.displayEnergy();
	}

}