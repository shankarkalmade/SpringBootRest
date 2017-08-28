package com.shankar.spring.dbrepos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shankar.spring.models.Reader;


public interface ReaderRepository extends JpaRepository<Reader,String>{
	
	
}
