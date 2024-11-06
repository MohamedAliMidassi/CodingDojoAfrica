package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.models.Books;
import com.example.demo.repositeries.BookRepository;

@Service
public class BookService {
	// adding the book repository as a dependency
    private final BookRepository bookRepository;
    
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    //returns all the books
    public List<Books> allBooks(){
    	return bookRepository.findAll();
    }
    //creates a book
    
    public Books createBook(Books book) {
    	return bookRepository.save(book);
    }
    
    //retrieve a book by id
    public Books findBook(Long id) {
    	Optional<Books> optionalBook = bookRepository.findById(id);
    	if(optionalBook.isPresent()) {
    		return optionalBook.get();
    	}else {
    		return null;
    	}
    }
    

    
    //update a book
    
    public Books editBook(Long id,String title,String desc,String lang,Integer numOfPages) {
        Optional<Books> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            Books book = optionalBook.get();
            book.setTitle(title);
            book.setDescription(desc);
            book.setLanguage(lang);
            book.setNumberOfPages(numOfPages);
            return bookRepository.save(book);
        } else {
            return null;
        }
}
    
    //delete a book
    public void deleteBook(Long id) {
		bookRepository.deleteById(id);
	}
    
}
