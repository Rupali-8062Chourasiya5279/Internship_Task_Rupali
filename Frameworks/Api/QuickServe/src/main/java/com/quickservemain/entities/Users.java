package com.quickservemain.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "users")
public class Users {
	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name="user_id")
	private String userid;
	
	@Column(name="name",nullable = false)
	private String name;
	
	@Column(name = "mobile")
	private String mobile;
	
	@Column(name = "email",unique = true,nullable = false)
	private String email;
	
	@Column(name="password",nullable = false)
	private String password;
	
	@Enumerated(EnumType.STRING)
	@Column(name="role",nullable = false)
	private Role role;
	
	
	@Column(name="created_at")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdat;
	
	@Column(name="updated_at")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updatedat;
	
	public enum Role
	{
		admin,service_provider,customer
	}

	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Users(String name, String mobile, String email, String password, Role role, Date createdat,
			Date updatedat) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.email = email;
		this.password = password;
		this.role = role;
		this.createdat = createdat;
		this.updatedat = updatedat;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
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
		return "Users [userid=" + userid + ", name=" + name + ", mobile=" + mobile + ", email=" + email + ", password="
				+ password + ", role=" + role + ", createdat=" + createdat + ", updatedat=" + updatedat + "]";
	}
	
	

}
