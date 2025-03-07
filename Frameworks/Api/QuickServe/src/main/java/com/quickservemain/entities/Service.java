package com.quickservemain.entities;

import java.math.BigDecimal;
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
@Table(name="service")
public class Service {
	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "service_id")
	private String serviceid;
	
	@ManyToOne
	@JoinColumn(name="business_id",referencedColumnName = "b_id",nullable = false)
	private Business businessid;
	
	@ManyToOne
	@JoinColumn(name = "subcategory_id",referencedColumnName = "subcategory_id",nullable = false)
	private SubCategories subcategoryid;
	
	@Column(name = "service_name")
	private String servicename;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "price",precision = 6,scale = 2)
	private BigDecimal price;
	
	@Column(name = "created_at",nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdat;
	
	@Column(name = "updated_at",nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date updatedat;

	public Service() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Service(Business businessid, SubCategories subcategoryid, String servicename, String description,
			BigDecimal price, Date createdat, Date updatedat) {
		super();
		this.businessid = businessid;
		this.subcategoryid = subcategoryid;
		this.servicename = servicename;
		this.description = description;
		this.price = price;
		this.createdat = createdat;
		this.updatedat = updatedat;
	}

	public String getServiceid() {
		return serviceid;
	}

	public void setServiceid(String serviceid) {
		this.serviceid = serviceid;
	}

	public Business getBusinessid() {
		return businessid;
	}

	public void setBusinessid(Business businessid) {
		this.businessid = businessid;
	}

	public SubCategories getSubcategoryid() {
		return subcategoryid;
	}

	public void setSubcategoryid(SubCategories subcategoryid) {
		this.subcategoryid = subcategoryid;
	}

	public String getServicename() {
		return servicename;
	}

	public void setServicename(String servicename) {
		this.servicename = servicename;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
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
		return "Service [serviceid=" + serviceid + ", businessid=" + businessid + ", subcategoryid=" + subcategoryid
				+ ", servicename=" + servicename + ", description=" + description + ", price=" + price + ", createdat="
				+ createdat + ", updatedat=" + updatedat + "]";
	}

}
