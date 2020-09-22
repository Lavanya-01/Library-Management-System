package com.mindtree.librarymanagementsystem.service.serviceimplementation;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import com.mindtree.librarymanagementsystem.entity.Books;
import com.mindtree.librarymanagementsystem.entity.Library;
import com.mindtree.librarymanagementsystem.repository.BookRepository;
import com.mindtree.librarymanagementsystem.repository.LibraryRepository;

@SpringBootTest
@RunWith(MockitoJUnitRunner.class)
public class BookTests {
	
	
	@InjectMocks
	private BookServiceImplementation bookService;
	
	@Mock
	private BookRepository bookRepo;
	
	
	private Books book=new Books();
	
	@Mock
	private LibraryRepository libRepo;
	
	private Library lib=new Library();


	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testAddBook() {
		
		List<Books> books=new ArrayList<>();
		book.setBookId(1);
		book.setBookName("harry potter");
		book.setAuthor("J.K.R");
		book.setVol(23);
		book.setYearOfPublication(2019);
		book.setLibrary(lib);
		books.add(book);
		lib.setLibraryId(11);
		lib.setLibraryName("A");
		lib.setAddress("patna");
		lib.setBooks(books);
		books=lib.getBooks();
		when(libRepo.findById((long) 11)).thenReturn(Optional.of(lib));
		when(bookRepo.save(book)).thenReturn(book);
		assertEquals(book,bookService.saveBook(book, 11));
	}
	
	@Test
	public void testListBook() {
		List<Books> book=new ArrayList<>();
		lib.setLibraryId(11);
		lib.setLibraryName("A");
		lib.setAddress("patna");
		book.add(new Books("harry potter","J.K.R",23,2019,lib));
		book.add(new Books("potter","J.K",73,2089,lib));
		when(libRepo.findById((long) 11)).thenReturn(Optional.of(lib));
		book=lib.getBooks();
		assertEquals(book,bookService.listAllBook(11));
	}
	
	@Test
	public void test()  {
		book.setBookId(1);
		book.setBookName("harry potter");
		book.setAuthor("J.K.R");
		book.setVol(23);
		book.setYearOfPublication(2019);
		when(bookRepo.findById((long) 1)).thenReturn(Optional.of(book));
		assertEquals(book,bookService.getBook(1));
	}

}
 