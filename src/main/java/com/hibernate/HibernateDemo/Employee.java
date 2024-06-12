package com.hibernate.HibernateDemo;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Employee {
	
	@Id
	private int eId;
	private String eName;
	private int eSalary;
	@OneToMany(mappedBy = "employee")
	private List<Laptop> laptop = new ArrayList<Laptop>();
	
	public Employee(int eId, String eName, int eSalary, List<Laptop> laptop) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eSalary = eSalary;
		this.laptop = laptop;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public int geteSalary() {
		return eSalary;
	}
	public void seteSalary(int eSalary) {
		this.eSalary = eSalary;
	}
	
	public List<Laptop> getLaptop() {
		return laptop;
	}
	public void setLaptop(List<Laptop> laptop) {
		this.laptop = laptop;
	}
	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", eSalary=" + eSalary + "]";
	}
	
	

}
