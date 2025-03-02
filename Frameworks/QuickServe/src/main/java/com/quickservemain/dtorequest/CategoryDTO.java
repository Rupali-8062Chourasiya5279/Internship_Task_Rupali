package com.quickservemain.dtorequest;

import jakarta.validation.constraints.NotNull;

public class CategoryDTO {
	
	@NotNull(message = "can not be null")
	private String categoryname;

	public CategoryDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CategoryDTO(@NotNull(message = "can not be null") String categoryname) {
		super();
		this.categoryname = categoryname;
	}

	public String getCategoryname() {
		return categoryname;
	}

	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}

	@Override
	public String toString() {
		return "CategoryDTO [categoryname=" + categoryname + "]";
	}
	
	

}
