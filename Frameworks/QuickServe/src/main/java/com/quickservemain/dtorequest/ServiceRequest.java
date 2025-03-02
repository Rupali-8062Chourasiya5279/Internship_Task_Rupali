package com.quickservemain.dtorequest;

import java.math.BigDecimal;

import com.quickservemain.entities.Business;
import com.quickservemain.entities.SubCategories;

public class ServiceRequest {
	
	private Business businessid;
	private SubCategories subcategoryid;
	private String servicename;
	private String description;
	private BigDecimal price;
	public ServiceRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ServiceRequest(Business businessid, SubCategories subcategoryid, String servicename, String description,
			BigDecimal price) {
		super();
		this.businessid = businessid;
		this.subcategoryid = subcategoryid;
		this.servicename = servicename;
		this.description = description;
		this.price = price;
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
	@Override
	public String toString() {
		return "ServiceRequest [businessid=" + businessid + ", subcategoryid=" + subcategoryid + ", servicename="
				+ servicename + ", description=" + description + ", price=" + price + "]";
	}

}
