package com.mindtree.librarymanagementsystem.service;

import java.util.List;

import com.mindtree.librarymanagementsystem.entity.Books;

public interface BookService {

	List<Books> listAllBook(long libraryId);

	Books saveBook(Books book, long id);

	Books getBook(long bookId);

	Books updateBook(Books book, long bookId);

}
