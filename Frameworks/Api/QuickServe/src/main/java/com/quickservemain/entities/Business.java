package com.quickservemain.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "business")
public class Business {
	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "b_id")
	private String bid;
	
	@ManyToOne
	@JoinColumn(name = "u_id",referencedColumnName = "user_id",nullable = false)
	private Users uid;
	
	@Column(name = "b_name",nullable = false)
	private String bname;
	
	@Column(nullable = false)
	private String address;
	
	@Column(name="contact_info",nullable = false,length = 10)
	private String contactinfo;
	
	@Column(name = "logo_url")
	private String logourl;
	
	@Column(name = "created_at")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdat;
	
	@Column(name = "updated_at")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updatedat;

	public Business() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Business(Users uid, String bname, String address, String contactinfo, String logourl, Date createdat,
			Date updatedat) {
		super();
		this.uid = uid;
		this.bname = bname;
		this.address = address;
		this.contactinfo = contactinfo;
		this.logourl = logourl;
		this.createdat = createdat;
		this.updatedat = updatedat;
	}

	public String getBid() {
		return bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
	}

	public Users getUid() {
		return uid;
	}

	public void setUid(Users uid) {
		this.uid = uid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContactinfo() {
		return contactinfo;
	}

	public void setContactinfo(String contactinfo) {
		this.contactinfo = contactinfo;
	}

	public String getLogourl() {
		return logourl;
	}

	public void setLogourl(String logourl) {
		this.logourl = logourl;
	}

	public Date getCreatedat() {
		return createdat;
	}

	public void setCreatedat(Date createdat) {
		this.createdat = createdat;
	}

	public Date getUpdatedat() {
		return updatedat;
	}

	public void setUpdatedat(Date updatedat) {
		this.updatedat = updatedat;
	}

	@Override
	public String toString() {
		return "Business [bid=" + bid + ", uid=" + uid + ", bname=" + bname + ", address=" + address + ", contactinfo="
				+ contactinfo + ", logourl=" + logourl + ", createdat=" + createdat + ", updatedat=" + updatedat + "]";
	}
	
	

}
