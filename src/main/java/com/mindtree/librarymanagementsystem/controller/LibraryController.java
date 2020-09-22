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

import com.mindtree.librarymanagementsystem.entity.Library;
import com.mindtree.librarymanagementsystem.service.LibraryService;

@Controller
public class LibraryController {

	@Autowired
	private LibraryService libraryService;
	
	@RequestMapping("/")
	public String viewHomePage()
	{
		return "index";
	}
	
	@RequestMapping("/register")
	public String library(Model model)
	{
		 Library library=new Library(); 
	    model.addAttribute("library", library);  
	    return "register";  
	}
	
	
	@RequestMapping(value="/addlibrary", method=RequestMethod.POST )
	public String addLibrary(@ModelAttribute("library") Library library)
	{
		libraryService.addLibrary(library);
		return "redirect:/";
	}
	
	
	@RequestMapping(value = "/view", method = RequestMethod.GET)
	public String view(Model model) {
		List<Library> listLibrary = libraryService.listAllLibrary();
		model.addAttribute("librarylist", listLibrary);
		return "view";
	}
	

	@RequestMapping(value = "/update/{libraryId}", method = RequestMethod.GET)
	public String update(@PathVariable long libraryId, Model model) {
		model.addAttribute("library", libraryService.getLibrary(libraryId));
		return "update";
	}

	@RequestMapping(value = "/update/{libraryId}/updatesave", method = RequestMethod.POST)
	public String editLibrarySave(@ModelAttribute("library") Library library, @PathVariable long libraryId) {
		libraryService.updateLibrary(library, libraryId);
		return "redirect:/view";
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String delete(Model model) {
		List<Library> listLibrary = libraryService.listAllLibrary();
		model.addAttribute("librarylist", listLibrary);
		return "delete";
	}

	@RequestMapping(value = "/deletelib")
	public String deteleLibrary(@RequestParam(name = "libraryId") long libraryId) {
		libraryService.deleteLibrary(libraryId);
		return "redirect:/view";

	}
	
}
