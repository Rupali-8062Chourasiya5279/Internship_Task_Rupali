package com.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Author {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int aid;
	@Column(name = "author_name")
	private String aname;
	@OneToOne(mappedBy = "author",cascade = CascadeType.ALL)
	private Book book;
	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Author(String aname, Book book) {
		super();
		this.aname = aname;
		this.book = book;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	@Override
	public String toString() {
		return "Author [aid=" + aid + ", aname=" + aname + ", book=" + book + "]";
	}

	
}
