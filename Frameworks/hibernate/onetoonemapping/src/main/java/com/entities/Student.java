package com.entities;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Student_info")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sid;
	
	@Column(name = "student_name")
	private String name;
	
	@Column(name = "student_date_of_birth")
	private int sdob;
	
	@Column(name = "Student_mobile_no",unique = true, length = 10)
	private String contact;
	
	@JoinColumn(name = "Student_course")
	@OneToOne
	private Course course;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int sdob, String contact, Course course) {
		super();
		this.name = name;
		this.sdob = sdob;
		this.contact = contact;
		this.course = course;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSdob() {
		return sdob;
	}
	public void setSdob(int sdob) {
		this.sdob = sdob;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", sdob=" + sdob + ", contact=" + contact + "]";
	}
	
	
}
