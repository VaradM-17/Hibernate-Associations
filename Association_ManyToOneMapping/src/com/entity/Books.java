package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Books 
{
	@Id
	private int book_id;
	private String book_name;
	
	@ManyToOne
	@JoinColumn(name = "library_id")
	private Library library;

	public Books() 
	{
		
	}

	public Books(int book_id, String book_name, Library library) 
	{
		super();
		this.book_id = book_id;
		this.book_name = book_name;
		this.library = library;
	}

	public int getBook_id() {
		return book_id;
	}

	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}

	public String getBook_name() {
		return book_name;
	}

	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}

	public Library getLibrary() {
		return library;
	}

	public void setLibrary(Library library) {
		this.library = library;
	}

	@Override
	public String toString() 
	{
		return "Books [book_id=" + book_id + ", book_name=" + book_name + ", library=" + library + "]";
	}
	
	
}
