package com.example.demo.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.example.demo.models.Book;
import com.example.demo.models.User;
import com.example.demo.services.BookService;
import com.example.demo.services.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;



@Controller
public class BookController {
	
	@Autowired
	private BookService bookServ;
	
	@Autowired
	private UserService userServ;
	
	
	
	@GetMapping("/books/new")
	public String newBook(@ModelAttribute("book") Book book, HttpSession session) {
		Long userId = (Long) session.getAttribute("user_id");
		
		if(userId==null) {
			return "redirect:/";
		}
		return "new.jsp";
	}
	
	
	
	@PostMapping("/processBook")
	public String createBook(@Valid @ModelAttribute("book") Book book, BindingResult result, HttpSession session) {
		Long userId = (Long) session.getAttribute("user_id");
		
		if(result.hasErrors()) {
			return "new.jsp";
		}else {
			User user = userServ.findUserById(userId);
			book.setOwner(user);
			Book newBook = bookServ.createBook(book);
			return "redirect:/books/show/"+newBook.getId();
		}
	}
	
	@GetMapping("/books/show/{id}")
	public String showBook(@PathVariable("id") Long id, Model model, HttpSession session) {
		Long userId = (Long) session.getAttribute("user_id");
		
		if(userId==null) {
			return "redirect:/";
		}
		Book book =bookServ.findBookById(id);
		User user = userServ.findUserById(userId);
		model.addAttribute("book", book);
		model.addAttribute("user", user);
		return "show.jsp";
	}
	
	@GetMapping("/books")
	public String home(Model model, HttpSession session) {
		Long userId = (Long) session.getAttribute("user_id");
		
		if(userId==null) {
			return "redirect:/";
		}
		
		
		
		User user = userServ.findUserById(userId);
		model.addAttribute("user", user);
		List<Book> allBooks = bookServ.allBooks();
		model.addAttribute("allBooks", allBooks);
		return "home.jsp";
	}

	
	@GetMapping("/books/edit/{id}")
	public String updateBook(@PathVariable("id") Long id, Model model, HttpSession session) {
		Long userId = (Long) session.getAttribute("user_id");
		
		if(userId==null) {
			return "redirect:/";
		}
		Book book = bookServ.findBookById(id);//found book by id from database
		model.addAttribute("book", book);
		return "edit.jsp";
	}
	
	@PutMapping ("/updateBook/{id}")
	public String editBook(@Valid @ModelAttribute("book") Book book, BindingResult result, HttpSession session) {
		Long userId = (Long) session.getAttribute("user_id");
		
		if(result.hasErrors()) {
			return "edit.jsp";
		}else {
			User user = userServ.findUserById(userId);
			book.setOwner(user);
			bookServ.updateBook(book);
			return "redirect:/books";
		}
	}
	
	@DeleteMapping ("/books/delete/{id}")
	public String deleteBook(@PathVariable("id") Long id, HttpSession session) {
		Long userId = (Long) session.getAttribute("user_id");
		
		if(userId==null) {
			return "redirect:/";
		}
		bookServ.deleteBook(id);
		return "redirect:/books";
		
	}
}
