package com.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Library 
{
	@Id
	int library_id;
	String lib_name;
	
	@OneToMany(mappedBy = "library")
	private List<Books> books= new ArrayList<Books>();

	public Library() 
	{
		
	}

	public Library(int library_id, String lib_name, List<Books> books) {
		super();
		this.library_id = library_id;
		this.lib_name = lib_name;
		this.books = books;
	}

	public int getLibrary_id() {
		return library_id;
	}

	public void setLibrary_id(int library_id) {
		this.library_id = library_id;
	}

	public String getLib_name() {
		return lib_name;
	}

	public void setLib_name(String lib_name) {
		this.lib_name = lib_name;
	}

	public List<Books> getBooks() {
		return books;
	}

	public void setBooks(List<Books> books) {
		this.books = books;
	}

	@Override
	public String toString() 
	{
		return "Library [library_id=" + library_id + ", lib_name=" + lib_name + ", books=" + books + "]";
	}

	
	
}
