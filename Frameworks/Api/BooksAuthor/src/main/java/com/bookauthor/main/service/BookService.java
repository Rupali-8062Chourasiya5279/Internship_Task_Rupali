package com.bookauthor.main.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bookauthor.main.dao.BookRepository;
import com.bookauthor.main.entity.Book;

@Component
public class BookService {
	
	@Autowired
	private BookRepository br;
	
	public boolean addBook(Book b)
	{
		if(b!=null)
		{
		br.save(b);
		return true;
		}
		else
		{
		return false;
		}
	}
	
	
	public List<Book> show()
	{
		List<Book> ls = br.findAll();
		return ls;
	}
	
	public void dltBook(int id)
	{
		br.deleteById(id);
	}
	
	public void  uptBook(int id,Book b)
	{
		b.setB_id(id);
		br.save(b);
		
	}
}
