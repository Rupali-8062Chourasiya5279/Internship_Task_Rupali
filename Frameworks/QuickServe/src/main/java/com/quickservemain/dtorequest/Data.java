package com.quickservemain.dtorequest;

public class Data {
	
	private long total_users;
	private long total_business;
	private long active_booking;
	public Data() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public long getTotal_users() {
		return total_users;
	}



	public void setTotal_users(long total_users) {
		this.total_users = total_users;
	}



	public long getTotal_business() {
		return total_business;
	}



	public void setTotal_business(long total_business) {
		this.total_business = total_business;
	}



	public long getActive_booking() {
		return active_booking;
	}



	public void setActive_booking(long active_booking) {
		this.active_booking = active_booking;
	}



	public Data(long total_users, long total_business, long active_booking) {
		super();
		this.total_users = total_users;
		this.total_business = total_business;
		this.active_booking = active_booking;
	}



	@Override
	public String toString() {
		return "Data [total_users=" + total_users + ", total_business=" + total_business + ", active_booking="
				+ active_booking + "]";
	}

}
