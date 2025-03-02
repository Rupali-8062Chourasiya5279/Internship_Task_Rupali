package com.quickservemain.dtoreponse;

import com.quickservemain.dtorequest.Data;

public class AdminDashboardResponse {
	
	private String status;
	private Object data;
	private int status_code;
	public AdminDashboardResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AdminDashboardResponse(String status, Object data, int status_code) {
		super();
		this.status = status;
		this.data = data;
		this.status_code = status_code;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Object getData() {
		return data;
	}
	public void setData(Data data) {
		this.data = data;
	}
	public int getStatus_code() {
		return status_code;
	}
	public void setStatus_code(int status_code) {
		this.status_code = status_code;
	}
	@Override
	public String toString() {
		return "AdminDashboardResponse [status=" + status + ", data=" + data + ", status_code=" + status_code + "]";
	}
	

}
