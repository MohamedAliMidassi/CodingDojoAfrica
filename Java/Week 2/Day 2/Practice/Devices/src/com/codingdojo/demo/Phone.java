package com.codingdojo.demo;

public class Phone extends Device {

	public void Call() {
		System.out.println("Making a Call.");
		System.out.println("Battery decreased to: " + (this.battery-=5));
		System.out.println("************************************");
	}
	
	public void Game() {
		System.out.println("Playing a Game!");
		System.out.println("Battery decreased to: " + (this.battery-=20));
		System.out.println("************************************");
	}
	
	public void Charge() {
		System.out.println("Phone in Charge...");
		System.out.println("Battery increased to: " + (this.battery+=50));
		System.out.println("************************************");
	}
	

}
