package com.shankar.spring.dbrepos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shankar.spring.models.Book;
public interface ReadingListRepository extends JpaRepository<Book, Long>{
	
	List<Book> findByReader(String reader);
	
}
