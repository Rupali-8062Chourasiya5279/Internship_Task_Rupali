package com.quickservemain.dtoreponse;

import com.quickservemain.entities.SubCategories;

public class SubcategoryResponse {
	
	private String status;
	private String message;
	private SubCategories subcategory;
	private int status_code;
	public SubcategoryResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SubcategoryResponse(String status, String message, SubCategories subcategory, int status_code) {
		super();
		this.status = status;
		this.message = message;
		this.subcategory = subcategory;
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
	public SubCategories getSubcategory() {
		return subcategory;
	}
	public void setSubcategory(SubCategories subcategory) {
		this.subcategory = subcategory;
	}
	public int getStatus_code() {
		return status_code;
	}
	public void setStatus_code(int status_code) {
		this.status_code = status_code;
	}
	@Override
	public String toString() {
		return "SubcategoryResponse [status=" + status + ", message=" + message + ", subcategory=" + subcategory
				+ ", status_code=" + status_code + "]";
	}

}
