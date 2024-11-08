package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Book;
import com.example.demo.repositories.BookRepository;


@Service
public class BookService {
	
	@Autowired 
	private BookRepository bookRepo;
	
	
	public Book createBook(Book book) {
		return bookRepo.save(book);
	}
	
	
	
	public Book findBookById(Long id) {
		Optional<Book> opBook = bookRepo.findById(id);
		if (opBook.isPresent()) {
			return opBook.get();
		}else {
			return null;
		}
	}
	
	
	
	public List<Book> allBooks(){
		return bookRepo.findAll();
	}
	
	 
	
	public Book updateBook(Book book) {
		return bookRepo.save(book);
	}

	
	
	public void deleteBook(Long id) {
		bookRepo.deleteById(id);
	}
	
}
