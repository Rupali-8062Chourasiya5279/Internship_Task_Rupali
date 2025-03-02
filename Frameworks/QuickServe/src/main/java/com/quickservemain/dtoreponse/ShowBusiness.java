package com.quickservemain.dtoreponse;

import java.util.List;

import com.quickservemain.entities.Business;

public class ShowBusiness {
	
	private String status;
	private List<Business> business;
	private int status_code;
	public ShowBusiness() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ShowBusiness(String status, List<Business> business, int status_code) {
		super();
		this.status = status;
		this.business = business;
		this.status_code = status_code;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public List<Business> getBusiness() {
		return business;
	}
	public void setBusiness(List<Business> business) {
		this.business = business;
	}
	public int getStatus_code() {
		return status_code;
	}
	public void setStatus_code(int status_code) {
		this.status_code = status_code;
	}
	@Override
	public String toString() {
		return "ShowBusiness [status=" + status + ", business=" + business + ", status_code=" + status_code + "]";
	}

}
