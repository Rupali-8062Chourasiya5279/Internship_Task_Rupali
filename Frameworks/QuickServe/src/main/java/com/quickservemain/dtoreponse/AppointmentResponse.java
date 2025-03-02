package com.quickservemain.dtoreponse;

import com.quickservemain.entities.Appointments;

public class AppointmentResponse {
	private String status;
	private String message;
	private Appointments appointment;
	private int status_code;
	public AppointmentResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AppointmentResponse(String status, String message, Appointments appointment, int status_code) {
		super();
		this.status = status;
		this.message = message;
		this.appointment = appointment;
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
	public Appointments getAppointment() {
		return appointment;
	}
	public void setAppointment(Appointments appointment) {
		this.appointment = appointment;
	}
	public int getStatus_code() {
		return status_code;
	}
	public void setStatus_code(int status_code) {
		this.status_code = status_code;
	}
	@Override
	public String toString() {
		return "AppointmentResponse [status=" + status + ", message=" + message + ", appointment=" + appointment
				+ ", status_code=" + status_code + "]";
	}

}
