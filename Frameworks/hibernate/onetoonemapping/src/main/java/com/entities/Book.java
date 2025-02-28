package com.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "book_id")
	private int bid;
	@Column(name = "book_name")
	private String bname;
	@Column(name = "book_price")
	private double brate;
	@JoinColumn(name = "author_id")
	@OneToOne
	private Author author;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(String bname, double brate, Author author) {
		super();
		this.bname = bname;
		this.brate = brate;
		this.author = author;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public double getBrate() {
		return brate;
	}
	public void setBrate(double brate) {
		this.brate = brate;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book [bid=" + bid + ", bname=" + bname + ", brate=" + brate + ", author=" + author + "]";
	}
	
	
}
