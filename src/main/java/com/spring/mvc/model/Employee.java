package com.spring.mvc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String adminname,department,address;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id,String adminname, String department, String address) {
		super();
		this.id = id;
		this.adminname = adminname;
		this.department = department;
		this.address = address;
	}
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAdminname() {
		return adminname;
	}

	public void setAdminname(String adminname) {
		this.adminname = adminname;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", adminname=" + adminname + ", department=" + department + ", address=" + address
				+ "]";
	}
	
	
	
}
