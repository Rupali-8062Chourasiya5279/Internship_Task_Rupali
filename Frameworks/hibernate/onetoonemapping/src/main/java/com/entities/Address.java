package com.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
@Entity
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int addid;
	private String city;
	private String state;
	@OneToOne(mappedBy = "address")
	private Employee emp;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int addid, String city, String state) {
		super();
		this.addid = addid;
		this.city = city;
		this.state = state;
	}
	public int getAddid() {
		return addid;
	}
	public void setAddid(int addid) {
		this.addid = addid;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [addid=" + addid + ", city=" + city + ", state=" + state + "]";
	}

	
}
