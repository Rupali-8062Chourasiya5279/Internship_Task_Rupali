package com.quickservemain.dtoreponse;

import java.util.List;
import java.util.Optional;

import com.quickservemain.entities.Categories;

public class CategoryResponse {
	
	private String status;
	private String message;
	private Categories category;
	private Optional<Categories> cg;
	private List<Categories> cat;
	private int  status_code ;
	public CategoryResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CategoryResponse(String status, String message, Categories category, int status_code) {
		super();
		this.status = status;
		this.message = message;
		this.category = category;
		this.status_code = status_code;
	}
	public CategoryResponse(String status, String message, List<Categories> categories, int status_code) {
		super();
		this.status = status;
		this.message = message;
		this.cat = categories;
		this.status_code = status_code;
	}
	public CategoryResponse(String string, String string2, Optional<Categories> u, int i) {
		this.status = string;
		this.message = string2;
		this.cg = u;
		this.status_code = i;
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
	public Categories getCategory() {
		return category;
	}
	public void setCategory(Categories category) {
		this.category = category;
	}
	public int getStatus_code() {
		return status_code;
	}
	public void setStatus_code(int status_code) {
		status_code = status_code;
	}
	@Override
	public String toString() {
		return "CategoryResponse [status=" + status + ", message=" + message + ", category=" + category
				+ ", Status_code=" + status_code + "]";
	}

}
