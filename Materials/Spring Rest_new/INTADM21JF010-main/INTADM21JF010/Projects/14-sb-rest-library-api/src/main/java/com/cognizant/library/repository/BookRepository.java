package com.cognizant.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.library.entity.Book;
@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}
