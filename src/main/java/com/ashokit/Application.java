package com.ashokit;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashokit.entity.Book;
import com.ashokit.repo.BookRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);
		
		BookRepository repo = ctx.getBean(BookRepository.class);
		
		List<Book> allBooks = repo.getAllBooks();
		
		for(Book b:allBooks) {
			
			System.out.println(b);
			
		}
		System.out.println("==========================================");
		
		List<Book> books = repo.getBooks();
		
          for(Book b:books) {
			
			System.out.println(b);
			
		}
	}

}
