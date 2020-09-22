package com.mindtree.librarymanagementsystem.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Library {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long libraryId;
	private String libraryName;
	private String address;
	
	@OneToMany(cascade = CascadeType.PERSIST,mappedBy = "library")
	private List<Books> books;

	public Library() {
		super();
	}

	public Library(String libraryName, String address, List<Books> books) {
		super();
		this.libraryName = libraryName;
		this.address = address;
		this.books = books;
	}

	public long getLibraryId() {
		return libraryId;
	}

	public void setLibraryId(long libraryId) {
		this.libraryId = libraryId;
	}

	public String getLibraryName() {
		return libraryName;
	}

	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Books> getBooks() {
		return books;
	}

	public void setBooks(List<Books> books) {
		this.books = books;
	}

	

	@Override
	public String toString() {
		return "Library [libraryId=" + libraryId + ", libraryName=" + libraryName + ", address=" + address + ", books="
				+ books + "]";
	}
	
	
	
	
}
