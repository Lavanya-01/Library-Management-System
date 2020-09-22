package com.mindtree.librarymanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.librarymanagementsystem.entity.Books;

@Repository
public interface BookRepository extends JpaRepository<Books, Long>{

}
