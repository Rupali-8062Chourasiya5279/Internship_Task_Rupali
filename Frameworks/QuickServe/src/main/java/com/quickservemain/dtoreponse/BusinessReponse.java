package com.quickservemain.dtoreponse;

import java.util.Optional;

import com.quickservemain.entities.Business;
import com.quickservemain.entities.Categories;

public class BusinessReponse {
	
	private String status;
	private String message;
	private Business business;
	private int status_code;
	private Optional<Business> op;
	public BusinessReponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BusinessReponse(String status, String message, Business business, int status_code) {
		super();
		this.status = status;
		this.message = message;
		this.business = business;
		this.status_code = status_code;
	}
	public BusinessReponse(String status, String message, Optional<Business> op, int status_code) {
		super();
		this.status = status;
		this.message = message;
		this.op = op;
		this.status_code = status_code;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Business getBusiness() {
		return business;
	}
	public void setBusiness(Business business) {
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
		return "BusinessReponse [status=" + status + ", message=" + message + ", business=" + business
				+ ", status_code=" + status_code + "]";
	}
	
	

}
