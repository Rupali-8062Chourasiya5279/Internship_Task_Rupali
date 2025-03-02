package com.quickservemain.dtoreponse;

import com.quickservemain.entities.Payments;

public class PaymentResponse {
	
	private String status;
	private String message;
	private Payments payment;
	private int status_code;
	public PaymentResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PaymentResponse(String status, String message, Payments payment, int status_code) {
		super();
		this.status = status;
		this.message = message;
		this.payment = payment;
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
	public Payments getPayment() {
		return payment;
	}
	public void setPayment(Payments payment) {
		this.payment = payment;
	}
	public int getStatus_code() {
		return status_code;
	}
	public void setStatus_code(int status_code) {
		this.status_code = status_code;
	}
	@Override
	public String toString() {
		return "PaymentResponse [status=" + status + ", message=" + message + ", payment=" + payment + ", status_code="
				+ status_code + "]";
	}
}
