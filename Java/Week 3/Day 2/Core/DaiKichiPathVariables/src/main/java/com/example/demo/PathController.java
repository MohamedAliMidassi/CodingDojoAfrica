package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class PathController {
	
	
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
		
		@RequestMapping("/daikichi/travel/{place}")
		public String page3(@PathVariable("place") String place) {
			return "Congratulations! You will soon travel to " + place;
		}
		@RequestMapping("/daikichi/lotto/{num}")
		public String page4(@PathVariable("num") int num) {
			if(num % 2 == 0) {
			return "You will take a grand journey in the near future, but be wary of tempting offers.";
			}else {
			return "You have enjoyed the fruits of your labor, but now is a great time to spend time with family and friends.";
			}
		}
		
		
}
