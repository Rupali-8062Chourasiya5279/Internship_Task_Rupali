package com.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Worker {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int wid;
	private String name;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="wid")
	private List<Location> location;
	
	public List<Location> getLocation() {
		return location;
	}

	public void setLocation(List<Location> location) {
		this.location = location;
	}

	public Worker() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Worker(String name, List<Location> location) {
		super();
		this.name = name;
		this.location = location;
	}

	public int getWid() {
		return wid;
	}

	public void setWid(int wid) {
		this.wid = wid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Worker [wid=" + wid + ", name=" + name + ", location=" + location + "]";
	}

	

	
}
