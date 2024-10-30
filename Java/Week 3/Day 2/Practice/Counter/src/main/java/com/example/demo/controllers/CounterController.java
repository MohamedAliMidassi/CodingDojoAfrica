package com.example.demo.controllers;


import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CounterController {
	@RequestMapping("/")
	public String index(HttpSession session) {
		if( session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		}else {
			int num = (Integer) session.getAttribute("count");
			num++;
			session.setAttribute("count", num);
		}

		return "Index.jsp";
	}
	@RequestMapping("/other")
	public String other(HttpSession session) {
		if( session.getAttribute("count2") == null) {
			session.setAttribute("count2", 0);
		}else {
			int num = (Integer) session.getAttribute("count2");
			num+=2;
			session.setAttribute("count2", num);
		}
		
		return "Other.jsp";
	}
	@RequestMapping("/reset")
	public String reset(HttpSession session) {
		session.setAttribute("count", 0);
		return "Counter.jsp";
	}
	@RequestMapping("/reset2")
	public String reset2(HttpSession session) {
			session.setAttribute("count2", 0);
		return "Counter.jsp";
	}
	@RequestMapping("/counter")
	public String counter(HttpSession session) {
		session.getAttribute("count");
		session.getAttribute("count2");
				return "Counter.jsp";
	}
}
