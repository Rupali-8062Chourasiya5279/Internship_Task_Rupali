package com.entities;

import java.util.Date;

public class User {
	
	private int uid;
	private String uname;
	private String uemail;
	private String upassword;
	private Date udob;
	private String ucity;
	private String umobile;
	public User(int uid, String uname, String uemail, String upassword, Date udob, String ucity, String umobile) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.uemail = uemail;
		this.upassword = upassword;
		this.udob = udob;
		this.ucity = ucity;
		this.umobile = umobile;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUemail() {
		return uemail;
	}
	public void setUemail(String uemail) {
		this.uemail = uemail;
	}
	public String getUpassword() {
		return upassword;
	}
	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}
	public Date getUdob() {
		return udob;
	}
	public void setUdob(Date udob) {
		this.udob = udob;
	}
	public String getUcity() {
		return ucity;
	}
	public void setUcity(String ucity) {
		this.ucity = ucity;
	}
	public String getUmobile() {
		return umobile;
	}
	public void setUmobile(String umobile) {
		this.umobile = umobile;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", uemail=" + uemail + ", upassword=" + upassword + ", udob="
				+ udob + ", ucity=" + ucity + ", umobile=" + umobile + "]";
	}

}
