package com.quickservemain.dtoreponse;

public class VerifyEmailRes {
	
	private String status;
	private String message;
	private int status_code;
	public VerifyEmailRes() {
		super();
		// TODO Auto-generated constructor stub
	}
	public VerifyEmailRes(String status, String message, int status_code) {
		super();
		this.status = status;
		this.message = message;
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
	public int getStatus_code() {
		return status_code;
	}
	public void setStatus_code(int status_code) {
		this.status_code = status_code;
	}
	@Override
	public String toString() {
		return "VerifyEmailRes [status=" + status + ", message=" + message + ", status_code=" + status_code + "]";
	}

	
}
