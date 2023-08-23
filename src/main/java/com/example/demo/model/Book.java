package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String bookname;
	private float price;
	private int quantity;
	private String authorName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorNṇame(String authorName) {
		this.authorName = authorName;
	}
	public Book(int id, String bookname, float price, int quantity, String authorName) {
		super();
		this.id = id;
		this.bookname = bookname;
		this.price = price;
		this.quantity = quantity;
		this.authorName = authorName;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

}
