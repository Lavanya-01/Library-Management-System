package com.mindtree.librarymanagementsystem.service.serviceimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.librarymanagementsystem.entity.Library;
import com.mindtree.librarymanagementsystem.repository.LibraryRepository;
import com.mindtree.librarymanagementsystem.service.LibraryService;

@Service
public class LibraryServiceImplementation implements LibraryService{
	
	@Autowired
	private LibraryRepository libraryRepository;

	@Override
	public Library addLibrary(Library library){
		return libraryRepository.save(library);
	}

	@Override
	public List<Library> listAllLibrary() {
		return libraryRepository.findAll();
	}

	@Override
	public Library getLibrary(long libraryId) {
		return libraryRepository.findById(libraryId).orElse(null);
	}

	@Override
	public Library updateLibrary(Library library, long libraryId) {
		Library library2 = libraryRepository.findById(libraryId).orElse(null);
		if(library2!=null) {
		library2.setLibraryName(library.getLibraryName());
		}
		return libraryRepository.save(library2);
	}

	@Override
	public void deleteLibrary(long libraryId) {
	  libraryRepository.deleteById(libraryId);
	}

}
