package com.bookauthor.main.controller;

import java.net.http.HttpResponse;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bookauthor.main.entity.Book;
import com.bookauthor.main.service.BookService;
import com.fasterxml.jackson.annotation.JacksonInject.Value;

@RestController
public class MainController {
	
	@Autowired
	private BookService bs;
	
	@PostMapping("book")
	public ResponseEntity<Book> bookadd(@RequestBody Book b)
	{
		 boolean x = bs.addBook(b);
		 if(x)
		return ResponseEntity.status(HttpStatus.ACCEPTED).build();
		 else
		 return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).build();
	}
	
	@GetMapping("book")
	public ResponseEntity<List<Book>> book()
	{
		List<Book> ls  = bs.show();
		if(ls.size()<=0)
		{
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
		else
		{
			return ResponseEntity.of(Optional.of(ls));
		}
	}
	
	@DeleteMapping("book")
	public ResponseEntity<String> bookdlt(@RequestBody Book b)
	{
		bs.dltBook(b.getB_id());
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}
	
	@PutMapping("book/{id}")
	public ResponseEntity<Book> bookupt(@PathVariable ("id") int id,@RequestBody Book b)
	{
		bs.uptBook(id,b);
		return ResponseEntity.status(HttpStatus.OK).build();
	}

}
