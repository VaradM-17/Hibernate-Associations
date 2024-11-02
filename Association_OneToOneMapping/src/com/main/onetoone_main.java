package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Laptop;
import com.entity.Student;

public class onetoone_main 
{
	public static void main(String[] args) 
	{
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);
		cfg.addAnnotatedClass(Laptop.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		//bidirection
		Laptop l = new Laptop();
		l.setL_id(1);
		l.setL_name("Dell");
		
		Student s = new Student();
		s.setStudent_id(101);
		s.setStudent_name("Varad");
		
		s.setLaptop(l);
		l.setStudent(s);
		
		ss.persist(l);
		ss.persist(s);
		
		System.out.println("Successfully Mapped...");
		
		tr.commit();
		ss.close();
	}
}
