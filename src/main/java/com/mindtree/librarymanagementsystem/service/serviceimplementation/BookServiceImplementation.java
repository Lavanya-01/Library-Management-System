package com.mindtree.librarymanagementsystem.service.serviceimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.librarymanagementsystem.entity.Books;
import com.mindtree.librarymanagementsystem.entity.Library;
import com.mindtree.librarymanagementsystem.repository.BookRepository;
import com.mindtree.librarymanagementsystem.repository.LibraryRepository;
import com.mindtree.librarymanagementsystem.service.BookService;

@Service
public class BookServiceImplementation implements BookService{
	
	@Autowired
	private BookRepository bookRepository;
	
	@Autowired
	private LibraryRepository libraryRepository;

	@Override
	public List<Books> listAllBook(long libraryId) {
		List<Books> books = null;
		Library library = libraryRepository.findById(libraryId).orElse(null);
		if(library!=null) {
		 books=library.getBooks();
		}
		return books;
	}

	@Override
	public Books saveBook(Books book, long id) {
		Library library = libraryRepository.findById(id).orElse(null);
		if(library!=null) {
		book.setLibrary(library);
		List<Books> books=library.getBooks();
		books.add(book);
		library.setBooks(books);
		}
		return bookRepository.save(book);
		
	}

	@Override
	public Books getBook(long bookId) {
		
		return bookRepository.findById(bookId).orElse(null);
	}

	@Override
	public Books updateBook(Books book, long bookId) {
		Books book2 = bookRepository.findById(bookId).orElse(null);
		if(book2!=null) {
		book2.setBookName(book.getBookName());
		}
		return bookRepository.save(book2);
	
	}

}
