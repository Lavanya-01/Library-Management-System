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

import com.mindtree.librarymanagementsystem.entity.Library;
import com.mindtree.librarymanagementsystem.repository.LibraryRepository;

@SpringBootTest
@RunWith(MockitoJUnitRunner.class)
public class LibraryTests {
	
	@InjectMocks
	private LibraryServiceImplementation libService;
	
	@Mock
	private LibraryRepository libRepo;
	
	@Mock
	private Library library=new Library();

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testAddLib()  {
		library.setLibraryId(1);
		library.setLibraryName("mussoorie");
		when(libRepo.save(library)).thenReturn(library);
		assertEquals(library,libService.addLibrary(library));
	}
	
	@Test
	public void testGetAll() {
		List<Library> list=new ArrayList<>();
		list.add(new Library("A","patna",null));
		list.add(new Library("B","kolkata",null));
		when(libRepo.findAll()).thenReturn(list);
		assertEquals(list,libService.listAllLibrary());	
	}
	
	
	@Test
	public void testGetlib() {
		library.setLibraryId(1);
		library.setLibraryName("mussoorie");
		when(libRepo.findById((long) 1)).thenReturn(Optional.of(library));
		assertEquals(library,libService.getLibrary(1));	
	}
	
//	public void testDeleLib() {
//		
//		Library lib=new Library("A","patna",null);
//		lib.setLibraryId(1);
//		when(libRepo.findById((long) 1)).thenReturn(Optional.of(library));
//		assertEquals(lib,libService.deleteLibrary(1));	
//	}

}
