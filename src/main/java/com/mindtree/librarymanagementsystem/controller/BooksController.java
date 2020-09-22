package com.mindtree.librarymanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mindtree.librarymanagementsystem.entity.Books;
import com.mindtree.librarymanagementsystem.entity.Library;
import com.mindtree.librarymanagementsystem.service.BookService;
import com.mindtree.librarymanagementsystem.service.LibraryService;

@Controller
public class BooksController {
	
	@Autowired
	private BookService bookService;
	
	@Autowired
	private LibraryService libraryService;
	
	@RequestMapping(value = "/{libraryId}", method = RequestMethod.GET)
	public String bookhomepage(Model model, @PathVariable long libraryId) {
		List<Books> listBook = bookService.listAllBook(libraryId);
		model.addAttribute("booklist", listBook);
		return "book";
	}

	@RequestMapping(value = "bookadd", method = RequestMethod.GET)
	public String displayAddBookPage(Model model, @RequestParam("libraryId") long libraryId) {
		Library library = libraryService.getLibrary(libraryId);
		model.addAttribute("lib", library);
		model.addAttribute("book", new Books());
		return "addbook";
	}

	@RequestMapping(value = "savebook", method = RequestMethod.POST)
	public String addBook(@ModelAttribute("book") Books book, @RequestParam("libraryId") long libraryId) {
		bookService.saveBook(book, libraryId);
		return "redirect:/" + libraryId;
	}
	
	@RequestMapping(value = "editbook/{bookId}", method = RequestMethod.GET)
	public String editLibraryPage(@PathVariable long bookId, Model model) {
		model.addAttribute("book", bookService.getBook(bookId));
		return "updatebook";
	}

	@RequestMapping(value = "editbook/{bookId}/editbooksave", method = RequestMethod.POST)
	public String editLibrarySave(@ModelAttribute("book") Books book, @PathVariable long bookId) {
		bookService.updateBook(book, bookId);
		Books bookdata = bookService.getBook(bookId);
		long libId = bookdata.getLibrary().getLibraryId();
		return "redirect:/" + libId;
	}
	
	

}
