package com.quickservemain.entities;

import java.time.LocalDateTime;
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
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "appointments")
public class Appointments {
	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "appointmentid")
	private String appointmentid;
	
	@ManyToOne
	@JoinColumn(name = "serviceid",referencedColumnName = "serviceid",nullable = false)
	private Service serviceid;
	
	@ManyToOne
	@JoinColumn(name = "userid",referencedColumnName = "userid",nullable = false)
	private Users userid;
	
	@Column(name = "appointmentdate",nullable = false)
	@Temporal(TemporalType.TIME)
	private Date appointmentdate;
	
	@Column(name = "timeslot",nullable = false)
	private String timeslot;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "status",nullable = false)
	private Status status;
	
	@Column(name = "createdat",nullable = false,updatable = false)
	private LocalDateTime createdat;

	@Column(name = "updatedat",nullable = false)
	private LocalDateTime updateat;
	
	public enum Status 
	{
		book,cancelled,complete;
	}
	
	@PrePersist
	public void onPrePersist()
	{
		this.createdat=LocalDateTime.now();
		this.updateat=LocalDateTime.now();
	}

	public Appointments() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Appointments(Service serviceid, Users userid, Date appointmentdate, String timeslot, Status status,
			LocalDateTime createdat, LocalDateTime updateat) {
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

	public LocalDateTime getCreatedat() {
		return createdat;
	}

	public void setCreatedat(LocalDateTime createdat) {
		this.createdat = createdat;
	}

	public LocalDateTime getUpdateat() {
		return updateat;
	}

	public void setUpdateat(LocalDateTime updateat) {
		this.updateat = updateat;
	}

	@Override
	public String toString() {
		return "Appointments [appointmentid=" + appointmentid + ", serviceid=" + serviceid + ", userid=" + userid
				+ ", appointmentdate=" + appointmentdate + ", timeslot=" + timeslot + ", status=" + status
				+ ", createdat=" + createdat + ", updateat=" + updateat + "]";
	}

}
