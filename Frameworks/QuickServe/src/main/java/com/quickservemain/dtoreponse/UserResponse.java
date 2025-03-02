package com.quickservemain.dtoreponse;

import java.util.Optional;

import com.quickservemain.entities.Users;

public class UserResponse {
	
	private String status;
	private String message;
	private Users user;
	private Optional<Users> u;
	public UserResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserResponse(String status, String message, Users user) {
		super();
		this.status = status;
		this.message = message;
		this.user = user;
	}
	
	public UserResponse(String status, String message, Optional<Users> u) {
		super();
		this.status = status;
		this.message = message;
		this.u = u;
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
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "UserResponse [status=" + status + ", message=" + message + ", user=" + user + "]";
	}

}
