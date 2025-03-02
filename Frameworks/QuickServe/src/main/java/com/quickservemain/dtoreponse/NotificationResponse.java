package com.quickservemain.dtoreponse;

import com.quickservemain.entities.Notifications;

public class NotificationResponse {
	
	private String status;
	private String message;
	private Notifications notification;
	private int status_code;
	public NotificationResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NotificationResponse(String status, String message, Notifications notification, int status_code) {
		super();
		this.status = status;
		this.message = message;
		this.notification = notification;
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
	public Notifications getNotification() {
		return notification;
	}
	public void setNotification(Notifications notification) {
		this.notification = notification;
	}
	public int getStatus_code() {
		return status_code;
	}
	public void setStatus_code(int status_code) {
		this.status_code = status_code;
	}
	@Override
	public String toString() {
		return "NotificationResponse [status=" + status + ", message=" + message + ", notification=" + notification
				+ ", status_code=" + status_code + "]";
	}
}
