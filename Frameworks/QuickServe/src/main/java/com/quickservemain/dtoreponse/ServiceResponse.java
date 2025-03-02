package com.quickservemain.dtoreponse;

import com.quickservemain.entities.Service;

public class ServiceResponse {
	
	private String status ;
	private String message;
	private Service service;
	private int status_code;
	public ServiceResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ServiceResponse(String status, String message, Service service, int status_code) {
		super();
		this.status = status;
		this.message = message;
		this.service = service;
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
	public Service getService() {
		return service;
	}
	public void setService(Service service) {
		this.service = service;
	}
	public int getStatus_code() {
		return status_code;
	}
	public void setStatus_code(int status_code) {
		this.status_code = status_code;
	}
	@Override
	public String toString() {
		return "ServiceResponse [status=" + status + ", message=" + message + ", service=" + service + ", status_code="
				+ status_code + "]";
	}

}
