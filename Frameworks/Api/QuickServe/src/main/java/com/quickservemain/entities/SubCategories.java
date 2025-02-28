package com.quickservemain.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "subcategories")
public class SubCategories {
	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "subcategory_id")
	private String subcategoryid;
	
	@ManyToOne
	@JoinColumn(name = "category_id",referencedColumnName = "category_id",nullable = false)
	private Categories categoryid;
	
	@Column(name = "subcategory_name",nullable = false)
	private String subcategoryname;
	
	@Column(name = "created_at",nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdat;
	
	@Column(name = "updated_at",nullable = false)
	@Temporal(TemporalType.TIMESTAMP)	
	private Date updatedat;

	public SubCategories() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SubCategories(Categories categoryid, String subcategoryname, Date createdat, Date updatedat) {
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
		return "SubCategories [subcategoryid=" + subcategoryid + ", categoryid=" + categoryid + ", subcategoryname="
				+ subcategoryname + ", createdat=" + createdat + ", updatedat=" + updatedat + "]";
	}
	
	

}
