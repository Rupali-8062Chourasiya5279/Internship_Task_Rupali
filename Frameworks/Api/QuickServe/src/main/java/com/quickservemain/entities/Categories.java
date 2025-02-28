package com.quickservemain.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "categories")
public class Categories {
	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "category_id")
	private String categoryid;
	
	@Column(name = "category_name",nullable = false)
	private String categoryname;
	
	@Column(name = "created_at",nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdat;
	
	@Column(name = "updated_at",nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date updatedat;

	public Categories() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Categories(String categoryname, Date createdat, Date updatedat) {
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

	public Date getCreatedat() {
		return createdat;
	}

	public void setCreatedat(Date createdat) {
		this.createdat = createdat;
	}

	public Date getUpdatedat() {
		return updatedat;
	}

	public void setUpdatedat(Date updatedat) {
		this.updatedat = updatedat;
	}

	@Override
	public String toString() {
		return "Categories [categoryid=" + categoryid + ", categoryname=" + categoryname + ", createdat=" + createdat
				+ ", updatedat=" + updatedat + "]";
	}

}
