package com.quickservemain.dtorequest;

import com.quickservemain.entities.Users;

import jakarta.validation.constraints.NotNull;

public class BusinessReq {

	
	private Users userid;
	private String businessname;
	private String address;
	private String contactinfo;
	private String logourl;

	public BusinessReq() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BusinessReq(Users userid, String businessname, String address, String contactinfo, String logourl) {
		super();
		this.userid = userid;
		this.businessname = businessname;
		this.address = address;
		this.contactinfo = contactinfo;
		this.logourl = logourl;
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

	@Override
	public String toString() {
		return "BusinessReq [userid=" + userid + ", businessname=" + businessname + ", address=" + address
				+ ", contactinfo=" + contactinfo + ", logourl=" + logourl + "]";
	}

}
