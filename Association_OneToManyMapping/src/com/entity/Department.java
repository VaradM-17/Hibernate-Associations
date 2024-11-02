package com.entity;

import java.util.List;
import java.util.jar.Attributes.Name;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Department 
{
	@Id
	private int dept_id;
	private String dept_name;
	
	@OneToMany(mappedBy="dept")
	private List<Employee> emp;
	
	public Department()
	{
		
	}

	public Department(int dept_id, String dept_name, List<Employee> emp) 
	{
		super();
		this.dept_id = dept_id;
		this.dept_name = dept_name;
		this.emp = emp;
	}

	public int getDept_id() {
		return dept_id;
	}

	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}

	public String getDept_name() {
		return dept_name;
	}

	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}

	public List<Employee> getEmp() {
		return emp;
	}

	public void setEmp(List<Employee> emp) {
		this.emp = emp;
	}

	@Override
	public String toString() 
	{
		return "Department [dept_id=" + dept_id + ", dept_name=" + dept_name + ", emp=" + emp + "]";
	}
	
	
}
