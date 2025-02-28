package com.quickservemain.entities;

import java.util.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "appointments")
public class Appointments {
	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "appointment_id")
	private String appointmentid;
	
	@ManyToOne
	@JoinColumn(name = "service_id",referencedColumnName = "service_id",nullable = false)
	private Service serviceid;
	
	@ManyToOne
	@JoinColumn(name = "user_id",referencedColumnName = "user_id",nullable = false)
	private Users userid;
	
	@Column(name = "appointment_date",nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date appointmentdate;
	
	@Column(name = "time_slot",nullable = false)
	private String timeslot;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "status",nullable = false)
	private Status status;
	
	@Column(name = "created_at",nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdat;

	@Column(name = "updated_at",nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date updateat;
	
	public enum Status 
	{
		book,cancelled,complete;
	}

	public Appointments() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Appointments(Service serviceid, Users userid, Date appointmentdate, String timeslot, Status status,
			Date createdat, Date updateat) {
		super();
		this.serviceid = serviceid;
		this.userid = userid;
		this.appointmentdate = appointmentdate;
		this.timeslot = timeslot;
		this.status = status;
		this.createdat = createdat;
		this.updateat = updateat;
	}

	public String getAppointmentid() {
		return appointmentid;
	}

	public void setAppointmentid(String appointmentid) {
		this.appointmentid = appointmentid;
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

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Date getCreatedat() {
		return createdat;
	}

	public void setCreatedat(Date createdat) {
		this.createdat = createdat;
	}

	public Date getUpdateat() {
		return updateat;
	}

	public void setUpdateat(Date updateat) {
		this.updateat = updateat;
	}

	@Override
	public String toString() {
		return "Appointments [appointmentid=" + appointmentid + ", serviceid=" + serviceid + ", userid=" + userid
				+ ", appointmentdate=" + appointmentdate + ", timeslot=" + timeslot + ", status=" + status
				+ ", createdat=" + createdat + ", updateat=" + updateat + "]";
	}

}
