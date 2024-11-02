package com.main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Books;
import com.entity.Library;


public class Main_Class 
{
	public static void main(String[] args) 
	{
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Books.class);
		cfg.addAnnotatedClass(Library.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		
		Books b1 = new Books();
		b1.setBook_id(101);
		b1.setBook_name("Java By James Goslin.");
		
		Books b2 = new Books();
		b2.setBook_id(102);
		b2.setBook_name("Hibernate By Gavin King.");
		
		Library l = new Library();
		l.setLibrary_id(201);
		l.setLib_name("JBK");
	
		
		b1.setLibrary(l);
		b2.setLibrary(l);
		
		/////////////////////////////////////////////
		
		List<Books> list = new ArrayList<Books>();
		list.add(b1);
		list.add(b2);
		
		l.setBooks(list);
		
		ss.persist(b1);
		ss.persist(b2);
		ss.persist(l);
		
		System.out.println("map succesfully....");
		
		tr.commit();
		ss.close();
	}
}
