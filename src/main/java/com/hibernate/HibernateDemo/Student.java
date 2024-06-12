package com.hibernate.HibernateDemo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name="Student")
public class Student {
	
	@Id@Column(name="Student_ID")
	private int sID;
	private StudentName sName;
	@Column(name="Student_Marks")
	private int sMarks;
	public Student(int sID, StudentName sName, int sMarks) {
		super();
		this.sID = sID;
		this.sName = sName;
		this.sMarks = sMarks;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getsID() {
		return sID;
	}
	public void setsID(int sID) {
		this.sID = sID;
	}
	
	public StudentName getsName() {
		return sName;
	}
	public void setsName(StudentName sName) {
		this.sName = sName;
	}
	public int getsMarks() {
		return sMarks;
	}
	public void setsMarks(int sMarks) {
		this.sMarks = sMarks;
	}
	@Override
	public String toString() {
		return "Student [sID=" + sID + ", sName=" + sName + ", sMarks=" + sMarks + "]";
	}
	
	

}
