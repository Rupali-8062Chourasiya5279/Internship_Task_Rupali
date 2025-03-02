package com.quickservemain.entities;

import java.time.LocalDateTime;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "categories")
public class Categories {
	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "categoryid")
	private String categoryid;
	
	@Column(name = "categoryname",nullable = false)
	private String categoryname;
	
	@Column(name = "createdat",nullable = false,updatable = false)
	private LocalDateTime createdat;
	
	@Column(name = "updatedat",nullable = false)
	private LocalDateTime updatedat;
	
	@PrePersist
	public void onPrepersist()
	{
		this.createdat=LocalDateTime.now();
		this.updatedat=LocalDateTime.now();
	}

	public Categories() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Categories(String categoryname, LocalDateTime createdat, LocalDateTime updatedat) {
		super();
		this.categoryname = categoryname;
		this.createdat = createdat;
		this.updatedat = updatedat;
	}

	public String getCategoryid() {
		return categoryid;
	}

	public void setCategoryid(String categoryid) {
		this.categoryid = categoryid;
	}

	public String getCategoryname() {
		return categoryname;
	}

	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}

	public LocalDateTime getCreatedat() {
		return createdat;
	}

	public void setCreatedat(LocalDateTime createdat) {
		this.createdat = createdat;
	}

	public LocalDateTime getUpdatedat() {
		return updatedat;
	}

	public void setUpdatedat(LocalDateTime updatedat) {
		this.updatedat = updatedat;
	}

	@Override
	public String toString() {
		return "Categories [categoryid=" + categoryid + ", categoryname=" + categoryname + ", createdat=" + createdat
				+ ", updatedat=" + updatedat + "]";
	}

}
