package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.entity.People;
import com.entity.Projects;

public class Call_main 
{
	public static void main(String[] args) 
	{
	    Configuration cfg = new Configuration();
	    cfg.configure();
	    cfg.addAnnotatedClass(People.class);
	    cfg.addAnnotatedClass(Projects.class);

	    SessionFactory sf = cfg.buildSessionFactory();
	    Session ss = sf.openSession();
	    Transaction tr = ss.beginTransaction();

	    
	    Projects pr1 = new Projects();
	    pr1.setProject_id(201);
	    pr1.setProject_name("Student Management System");

	    Projects pr2 = new Projects();
	    pr2.setProject_id(202);
	    pr2.setProject_name("Restaurant Billing System");

	    Projects pr3 = new Projects();
	    pr3.setProject_id(203);
	    pr3.setProject_name("Loan Finance Management System");

	
	    People p1 = new People();
	    p1.setPeople_id(101);
	    p1.setPeople_name("Varad");

	    People p2 = new People();
	    p2.setPeople_id(102);
	    p2.setPeople_name("Vam");

	    People p3 = new People();
	    p3.setPeople_id(103);
	    p3.setPeople_name("Tejas");

	   
	    p1.addProject(pr1);
	    p1.addProject(pr2);

	    p2.addProject(pr2);
	    p2.addProject(pr3);

	    p3.addProject(pr1);
	    p3.addProject(pr3);

	   
	    ss.persist(p1);
	    ss.persist(p2);
	    ss.persist(p3);
	    
	    ss.persist(pr1);
	    ss.persist(pr2);
	    ss.persist(pr3);
	    

	    tr.commit();
	    ss.close();

	    System.out.println("Records saved successfully!");
	}

}
