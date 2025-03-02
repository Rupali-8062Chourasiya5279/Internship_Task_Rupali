package com.quickservemain.entities;

import java.time.LocalDateTime;

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
@Table(name = "business")
public class Business {
	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private String businessid;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "userid",referencedColumnName = "userid")
	private Users userid;
	
	@Column(name = "businessname",nullable = false)
	private String businessname;
	
	@Column(name = "address", nullable = false)
	private String address;
	
	@Column(name = "contactinfo",nullable = false)
	private String contactinfo;
	
	@Column(name = "logourl",nullable = false)
	private String logourl;
	
	@Column(name = "updatedat",nullable = false)
	private LocalDateTime updatedat;
	
	@Column(name = "createdat",updatable = false,nullable = false)
	private LocalDateTime createdat;
	
	@PrePersist
	public void onprepersist()
	{
		this.createdat=LocalDateTime.now();
		this.updatedat=LocalDateTime.now();
	}

	public Business() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Business(Users userid, String businessname, String address, String contactinfo, String logourl,
			LocalDateTime updatedat, LocalDateTime createdat) {
		super();
		this.userid = userid;
		this.businessname = businessname;
		this.address = address;
		this.contactinfo = contactinfo;
		this.logourl = logourl;
		this.updatedat = updatedat;
		this.createdat = createdat;
	}

	public String getBusinessid() {
		return businessid;
	}

	public void setBusinessid(String businessid) {
		this.businessid = businessid;
	}

	public Users getUserid() {
		return userid;
	}

	public void setUserid(Users userid) {
		this.userid = userid;
	}

	public String getBusinessname() {
		return businessname;
	}

	public void setBusinessname(String businessname) {
		this.businessname = businessname;
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

	public LocalDateTime getUpdatedat() {
		return updatedat;
	}

	public void setUpdatedat(LocalDateTime updatedat) {
		this.updatedat = updatedat;
	}

	public LocalDateTime getCreatedat() {
		return createdat;
	}

	public void setCreatedat(LocalDateTime createdat) {
		this.createdat = createdat;
	}

	@Override
	public String toString() {
		return "Business [b_id=" + businessid + ", userid=" + userid + ", bname=" + businessname + ", address=" + address
				+ ", contactinfo=" + contactinfo + ", logourl=" + logourl + ", updatedat=" + updatedat + ", createdat="
				+ createdat + "]";
	}

}
