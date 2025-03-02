package com.quickservemain.entities;

import java.time.LocalDateTime;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonCreator;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class Users {
	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name="userid")
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
	
	
	@Column(name="createdat",updatable = false)
	private LocalDateTime createdat;
	
	@Column(name="updatedat")
	private LocalDateTime updatedat;
	
	public enum Role
	{
		admin,service_provider,customer
	}
	
	@PrePersist
	public void prePersistc()
	{
		this.createdat = LocalDateTime.now();
		this.updatedat = LocalDateTime.now();
	}

	@JsonCreator
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@OneToMany(mappedBy = "userid", cascade = CascadeType.ALL)
	private Set<Reviews> reviews;
	
	@OneToMany(mappedBy = "userid", cascade = CascadeType.ALL)
	private Set<Business> businesses;
	

	public Users(String name, String mobile, String email, String password, Role role, LocalDateTime createdat,
			LocalDateTime updatedat) {
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

	public LocalDateTime getCreatedat() {
		return createdat;
	}

	public void setCreatedat(LocalDateTime createdat) {
		this.createdat = createdat;
	}

	public LocalDateTime getUpdatedat() {
		return updatedat;
	}

	public void setUpdatedat(LocalDateTime updatedat) {
		this.updatedat = updatedat;
	}

	@Override
	public String toString() {
		return "Users [userid=" + userid + ", name=" + name + ", mobile=" + mobile + ", email=" + email + ", password="
				+ password + ", role=" + role + ", createdat=" + createdat + ", updatedat=" + updatedat + "]";
	}

	public void setRole(Role role) {
		this.role = role;
		
	}

}
