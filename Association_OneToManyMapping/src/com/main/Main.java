package com.main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Department;
import com.entity.Employee;

public class Main 
{
	public static void main(String[] args) 
	{
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Department.class);
		cfg.addAnnotatedClass(Employee.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		Employee e1 = new Employee();
		e1.setEmp_id(201);
		e1.setEmp_name("Vam");
		
		Employee e2 = new Employee();
		e2.setEmp_id(202);
		e2.setEmp_name("Tejas");
		
		Department d = new Department();
		d.setDept_id(1);
		d.setDept_name("Java Developer");
		
		
		e1.setDept(d);
		e2.setDept(d);
		
		/////////////////////////////////////////
		
		List<Employee> list = new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
		d.setEmp(list);
		
		ss.persist(e2);
		ss.persist(e1);
		ss.persist(d);
		
		
		System.out.println("map succesfully....");
		
		tr.commit();
		ss.close();
	}
}
