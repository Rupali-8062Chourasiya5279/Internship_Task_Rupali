package com.quickservemain.entities;

import java.time.LocalDateTime;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
@Table(name = "notifications")
public class Notifications {
	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "notificationid")
	private String notificationid;
	
	@ManyToOne
	@JoinColumn(name = "userid",referencedColumnName = "userid",nullable = false)
	private Users userid;
	
	@Column(name = "message",nullable = false)
	private String message;
	
	@Column(name = "isread",nullable = false)
	private boolean isRead;
	
	@Column(name = "createdat",nullable = false,updatable = false)
	private LocalDateTime createdat;

	@PrePersist
	public void onprepersist()
	{
		this.createdat=LocalDateTime.now();
	}
	public Notifications() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Notifications(Users userid, String message, boolean isRead, LocalDateTime createdat) {
		super();
		this.userid = userid;
		this.message = message;
		this.isRead = isRead;
		this.createdat = createdat;
	}

	public String getNotificationid() {
		return notificationid;
	}

	public void setNotificationid(String notificationid) {
		this.notificationid = notificationid;
	}

	public Users getUserid() {
		return userid;
	}

	public void setUserid(Users userid) {
		this.userid = userid;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean isRead() {
		return isRead;
	}

	public void setRead(boolean isRead) {
		this.isRead = isRead;
	}

	public LocalDateTime getCreatedat() {
		return createdat;
	}

	public void setCreatedat(LocalDateTime createdat) {
		this.createdat = createdat;
	}

	@Override
	public String toString() {
		return "Notifications [notificationid=" + notificationid + ", userid=" + userid + ", message=" + message
				+ ", isRead=" + isRead + ", createdat=" + createdat + "]";
	}

}
