package com.quickservemain.entities;

import java.time.LocalDateTime;
import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;

@Entity
@Table(name = "reviews")
public class Reviews {
	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "reviewid")
	private String reviewid;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "serviceid",referencedColumnName = "serviceid",nullable = false)
	private Service serviceid;
	
	@ManyToOne
	@JoinColumn(name = "userid",referencedColumnName = "userid",nullable = false)
	private Users userid;
	
	@Column(name = "rating")
	private int rating;
	
	@Column(name = "comment",nullable = false)
	private String comment;
	
	@Column(name = "createdat",nullable = false,updatable = false)
	private LocalDateTime createdat;
	
	@Column(name = "updatedat",nullable = false)
	private LocalDateTime updateat;

	@PrePersist
	public void onprepersist()
	{
		this.createdat=LocalDateTime.now();
		this.updateat=LocalDateTime.now();
	}
	public Reviews() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Reviews(Service serviceid, Users userid, int rating, String comment, LocalDateTime createdat, LocalDateTime updateat) {
		super();
		this.serviceid = serviceid;
		this.userid = userid;
		this.rating = rating;
		this.comment = comment;
		this.createdat = createdat;
		this.updateat = updateat;
	}

	public String getReviewid() {
		return reviewid;
	}

	public void setReviewid(String reviewid) {
		this.reviewid = reviewid;
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

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
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
		return "Reviews [reviewid=" + reviewid + ", serviceid=" + serviceid + ", userid=" + userid + ", rating="
				+ rating + ", comment=" + comment + ", createdat=" + createdat + ", updateat=" + updateat + "]";
	}

}
