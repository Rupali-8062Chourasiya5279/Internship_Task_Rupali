package com.quickservemain.dtorequest;

import com.quickservemain.entities.Users;

public class NotificationRequest {
	
	private Users userid;
	private String message;
	public NotificationRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NotificationRequest(Users userid, String message) {
		super();
		this.userid = userid;
		this.message = message;
	}
	public Users getUserid() {
		return userid;
	}
	public void setUserid(Users userid) {
		this.userid = userid;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "NotificationRequest [userid=" + userid + ", message=" + message + "]";
	}

}
