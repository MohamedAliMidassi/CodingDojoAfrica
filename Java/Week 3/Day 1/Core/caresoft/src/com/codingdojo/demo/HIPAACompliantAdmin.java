package com.codingdojo.demo;

public interface HIPAACompliantAdmin {
	abstract boolean assignPin(int pin);
    abstract boolean accessAuthorized(Integer confirmedAuthID);
}
