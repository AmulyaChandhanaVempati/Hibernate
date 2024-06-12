package com.hibernate.HibernateDemo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Laptop {
	@Id
	private int lID;
	private String lName;
	@ManyToOne
	private Employee employee;
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Laptop(int lID, String lName) {
		super();
		this.lID = lID;
		this.lName = lName;
	}
	
	public Laptop(int lID, String lName, Employee employee) {
		super();
		this.lID = lID;
		this.lName = lName;
		this.employee = employee;
	}
	public int getlID() {
		return lID;
	}
	public void setlID(int lID) {
		this.lID = lID;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	
	public Employee getStudent() {
		return employee;
	}
	public void setStudent(Employee employee) {
		this.employee = employee;
	}
	@Override
	public String toString() {
		return "Laptop [lID=" + lID + ", lName=" + lName + "]";
	}
	

}
