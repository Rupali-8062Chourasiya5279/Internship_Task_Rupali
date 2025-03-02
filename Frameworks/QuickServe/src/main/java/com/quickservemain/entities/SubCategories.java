package com.quickservemain.entities;

import java.time.LocalDateTime;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "subcategories")
public class SubCategories {
	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "subcategoryid")
	private String subcategoryid;
	
	@ManyToOne
	@JoinColumn(name = "categoryid",referencedColumnName = "categoryid",nullable = false)
	private Categories categoryid;
	
	@Column(name = "subcategoryname",nullable = false)
	private String subcategoryname;
	
	@Column(name = "createdat",nullable = false,updatable = false)
	private LocalDateTime createdat;
	
	@Column(name = "updatedat",nullable = false)	
	private LocalDateTime updatedat;

	public SubCategories() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@PrePersist
	public void onPrepersist()
	{
		this.createdat=LocalDateTime.now();
		this.updatedat=LocalDateTime.now();
	}

	public SubCategories(Categories categoryid, String subcategoryname, LocalDateTime createdat, LocalDateTime updatedat) {
		super();
		this.categoryid = categoryid;
		this.subcategoryname = subcategoryname;
		this.createdat = createdat;
		this.updatedat = updatedat;
	}

	public String getSubcategoryid() {
		return subcategoryid;
	}

	public void setSubcategoryid(String subcategoryid) {
		this.subcategoryid = subcategoryid;
	}

	public Categories getCategoryid() {
		return categoryid;
	}

	public void setCategoryid(Categories categoryid) {
		this.categoryid = categoryid;
	}

	public String getSubcategoryname() {
		return subcategoryname;
	}

	public void setSubcategoryname(String subcategoryname) {
		this.subcategoryname = subcategoryname;
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
		return "SubCategories [subcategoryid=" + subcategoryid + ", categoryid=" + categoryid + ", subcategoryname="
				+ subcategoryname + ", createdat=" + createdat + ", updatedat=" + updatedat + "]";
	}
	
	

}
