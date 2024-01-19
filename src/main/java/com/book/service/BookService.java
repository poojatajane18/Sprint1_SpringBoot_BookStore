package com.book.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.book.modal.Book;
import com.book.repository.BookRepository;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepo;

	public Book saveBook(@Valid Book book) {
		return bookRepo.save(book);
	}

	public List<Book> findAllBook() {
		return bookRepo.findAll();
	}

	
	public Optional<Book> findBookById(@Min(1) long bookId) {
		return bookRepo.findById(bookId);
	}

	public Book editBook(@Valid Book book) throws IllegalAccessException {
		Long id = book.getId();
		if (!bookRepo.existsById(id)) {
			throw new IllegalAccessException("Book with ID " + id + " not found");
		}
		return bookRepo.save(book);
	}

	public String deleteBook(@Min(1) long bookId) throws IllegalAccessException {
		if (!bookRepo.existsById(bookId)) {
			throw new IllegalAccessException("Book with ID " + bookId + " not found");
		}
		bookRepo.deleteById(bookId);
		return "Book with Id = " + bookId + " is successfully deleted";
	}
}
