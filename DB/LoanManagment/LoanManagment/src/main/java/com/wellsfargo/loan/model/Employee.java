package com.wellsfargo.loan.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	Long eid;
	String name;
	
	@Column(unique=true)
	String password;
	String Designition;
	String Department;
	
	
	public Long getId() {
		return eid;
	}
	public void setId(Long id) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDesignition() {
		return Designition;
	}
	public void setDesignition(String designition) {
		Designition = designition;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	
	

	
}
