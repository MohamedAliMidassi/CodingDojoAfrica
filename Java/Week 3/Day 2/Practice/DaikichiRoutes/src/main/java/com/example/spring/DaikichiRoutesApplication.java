package com.example.spring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class DaikichiController {
	@RequestMapping("/daikichi")
	public String index() {
		return "Welcome!";
	}
	
	@RequestMapping("/daikichi/today")
	public String page1() {
		return "Today you will find luck in all your endeavors!";
	}
	@RequestMapping("/daikichi/tomorrow")
	public String page2() {
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
	}
	
}