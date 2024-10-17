package com.codingdojo.demo;
public class Device {
	
	int battery;


	public Device() {
		super();
		this.battery= 100;
	}


	public String Status() {
		return "Battery life is: " + this.battery;
	}

}
