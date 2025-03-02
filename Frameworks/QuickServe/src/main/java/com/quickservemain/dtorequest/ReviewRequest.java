package com.quickservemain.dtorequest;

import com.quickservemain.entities.Service;
import com.quickservemain.entities.Users;

public class ReviewRequest {
	
	private Service serviceid;
	private Users userid;
	private int rating;
	private String comment;
	public ReviewRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ReviewRequest(Service service, Users user, int rating, String comment) {
		super();
		this.serviceid = service;
		this.userid = user;
		this.rating = rating;
		this.comment = comment;
	}
	public Service getServiceid() {
		return serviceid;
	}
	public void setServiceid(Service serviceid) {
		this.serviceid = serviceid;
	}
	public Users getUserid() {
		return userid;
	}
	public void setUserid(Users userid) {
		this.userid = userid;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	@Override
	public String toString() {
		return "ReviewRequest [serviceid=" + serviceid + ", userid=" + userid + ", rating=" + rating + ", comment="
				+ comment + "]";
	}
}
