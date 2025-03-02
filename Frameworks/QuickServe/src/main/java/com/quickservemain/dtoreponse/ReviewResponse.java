package com.quickservemain.dtoreponse;

import com.quickservemain.entities.Reviews;

public class ReviewResponse {
	
	private String status;
	private String message;
	private Reviews review;
	private int status_code;
	public ReviewResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ReviewResponse(String status, String message, Reviews review, int status_code) {
		super();
		this.status = status;
		this.message = message;
		this.review = review;
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
	public Reviews getReview() {
		return review;
	}
	public void setReview(Reviews review) {
		this.review = review;
	}
	public int getStatus_code() {
		return status_code;
	}
	public void setStatus_code(int status_code) {
		this.status_code = status_code;
	}
	@Override
	public String toString() {
		return "ReviewResponse [status=" + status + ", message=" + message + ", review=" + review + ", status_code="
				+ status_code + "]";
	}

}
