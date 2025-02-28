package com.quickservemain.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "reviews")
public class Reviews {
	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "review_id")
	private String reviewid;
	
	@ManyToOne
	@JoinColumn(name = "service_id",referencedColumnName = "service_id",nullable = false)
	private Service serviceid;
	
	@ManyToOne
	@JoinColumn(name = "user_id",referencedColumnName = "user_id",nullable = false)
	private Users userid;
	
	@Column(name = "rating")
	private int rating;
	
	@Column(name = "comment",nullable = false)
	private String comment;
	
	@Column(name = "created_at",nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdat;
	
	@Column(name = "updated_at",nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date updateat;

	public Reviews() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Reviews(Service serviceid, Users userid, int rating, String comment, Date createdat, Date updateat) {
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
		return "Reviews [reviewid=" + reviewid + ", serviceid=" + serviceid + ", userid=" + userid + ", rating="
				+ rating + ", comment=" + comment + ", createdat=" + createdat + ", updateat=" + updateat + "]";
	}

}
