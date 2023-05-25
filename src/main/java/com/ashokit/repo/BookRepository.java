package com.ashokit.repo;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ashokit.entity.Book;

public interface BookRepository extends JpaRepository<Book,Integer> {
	
	
	//our query is written by the programer
	@Query(value="select * from Book",nativeQuery=true)
	public List<Book> getAllBooks();
	
	//our HQL Query 
	@Query("from Book")
	public List<Book> getBooks();
	
	

}
