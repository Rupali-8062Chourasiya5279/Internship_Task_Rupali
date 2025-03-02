package com.quickservemain.dtorequest;

public class SubcategoryDto {
	
	private String subcategoryname;

	public SubcategoryDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SubcategoryDto(String subcategoryname) {
		super();
		this.subcategoryname = subcategoryname;
	}

	public String getSubcategoryname() {
		return subcategoryname;
	}

	public void setSubcategoryname(String subcategoryname) {
		this.subcategoryname = subcategoryname;
	}

	@Override
	public String toString() {
		return "SubcategoryDto [subcategoryname=" + subcategoryname + "]";
	}

}
