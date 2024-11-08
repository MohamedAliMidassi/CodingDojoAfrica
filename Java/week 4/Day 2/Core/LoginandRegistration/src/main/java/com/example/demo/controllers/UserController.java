package com.example.demo.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;


import com.example.demo.models.LoginUser;
import com.example.demo.models.User;
import com.example.demo.services.UserService;


@Controller
public class UserController {
	@Autowired
	private UserService userServ;
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("newUser", new User());
		model.addAttribute("newLogin", new LoginUser());
		
		
		return "index.jsp";
	}
	
	
	
	@GetMapping("/dashboard")
	public String dash(Model model, HttpSession session) {
		model.addAttribute("newUser", new User());
		System.out.println(model.addAttribute("newUser", new User()));
		model.addAttribute("newLogin", new LoginUser());
		
		Long userId = (Long) session.getAttribute("user_id");
		if(userId==null) {
			return "redirect:/";
		}
		User user = userServ.findUserById(userId);
		model.addAttribute("user", user);
		
		return "dash.jsp";
	}
	
	@PostMapping("/register")
	public String register(@Valid @ModelAttribute("newUser")User newUser, BindingResult result, HttpSession session, Model model) {
		userServ.register(newUser, result);
		if(result.hasErrors()) {
			model.addAttribute("newLogin", new LoginUser());
			return "index.jsp";
		}
		
		session.setAttribute("user_id", newUser.getId());
		return "redirect:/dashboard";
	}
	@PostMapping("/login")
	public String login(@Valid @ModelAttribute("newLogin")LoginUser newLogin, BindingResult result, HttpSession session, Model model) {
		User user=userServ.login(newLogin, result);
		if(result.hasErrors()) {
			model.addAttribute("newUser", new User());
			return "index.jsp";
		}
		
		session.setAttribute("user_id", user.getId());
		return "redirect:/dashboard";
	}
	
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
		
	}

	
	
}
