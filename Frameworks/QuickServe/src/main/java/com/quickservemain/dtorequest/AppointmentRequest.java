package com.quickservemain.dtorequest;

import java.util.Date;

import com.quickservemain.entities.Service;
import com.quickservemain.entities.Users;

public class AppointmentRequest {
	
	private Service serviceid;
	private Users userid;
	private Date appointmentdate;
	private String timeslot;
	public AppointmentRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AppointmentRequest(Service serviceid, Users userid, Date appointmentdate, String timeslot) {
		super();
		this.serviceid = serviceid;
		this.userid = userid;
		this.appointmentdate = appointmentdate;
		this.timeslot = timeslot;
	}
	public Service getServiceid() {
		return serviceid;
	}
	public void setServiceid(Service serviceid) {
		this.serviceid = serviceid;
	}
	public Users getUserid() {
		return userid;
	}
	public void setUserid(Users userid) {
		this.userid = userid;
	}
	public Date getAppointmentdate() {
		return appointmentdate;
	}
	public void setAppointmentdate(Date appointmentdate) {
		this.appointmentdate = appointmentdate;
	}
	public String getTimeslot() {
		return timeslot;
	}
	public void setTimeslot(String timeslot) {
		this.timeslot = timeslot;
	}
	@Override
	public String toString() {
		return "AppointmentRequest [serviceid=" + serviceid + ", userid=" + userid + ", appointmentdate="
				+ appointmentdate + ", timeslot=" + timeslot + "]";
	}
	
	
	

}
