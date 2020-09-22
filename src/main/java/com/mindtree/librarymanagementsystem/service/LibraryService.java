package com.mindtree.librarymanagementsystem.service;

import java.util.List;

import com.mindtree.librarymanagementsystem.entity.Library;

public interface LibraryService {

	Library addLibrary(Library library);

	List<Library> listAllLibrary();

	Library getLibrary(long libraryId);

	Library updateLibrary(Library library, long libraryId);

	void deleteLibrary(long libraryId);

}
