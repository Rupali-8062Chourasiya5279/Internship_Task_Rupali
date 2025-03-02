package com.quickservemain.dtoreponse;

import java.util.List;

import com.quickservemain.entities.Users;

public class ShowAllUsersRes {
	
	private String status;
	private List<Users> users;
	private int status_code;
	public ShowAllUsersRes() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ShowAllUsersRes(String status, List<Users> users, int status_code) {
		super();
		this.status = status;
		this.users = users;
		this.status_code = status_code;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public List<Users> getUsers() {
		return users;
	}
	public void setUsers(List<Users> users) {
		this.users = users;
	}
	public int getStatus_code() {
		return status_code;
	}
	public void setStatus_code(int status_code) {
		this.status_code = status_code;
	}
	@Override
	public String toString() {
		return "ShowAllUsersRes [status=" + status + ", users=" + users + ", status_code=" + status_code + "]";
	}

}
