
//same as Employee that I did in Question 5 
package com.madhu.springboot.Controller;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity 
public class Employee 
{
	@Id
	private long id;
	private String name;
	private String department;
	private String designation;
	
	public Employee()
	{
		
	}

	public Employee(long id, String name, String department, String designation) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.designation = designation;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
	
	
	
}
