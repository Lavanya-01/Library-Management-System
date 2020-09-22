package com.mindtree.librarymanagementsystem.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.librarymanagementsystem.entity.Library;

@Repository
public interface LibraryRepository extends JpaRepository<Library, Long>{

	Optional<Library> findByLibraryName(String libraryName);

}
