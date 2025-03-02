package com.quickservemain.dtorequest;

import com.quickservemain.entities.Users;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class UserDTO {
	
	@NotEmpty(message = "Name is Required")
	private String name;
	
	@Size(min=10,message = "contact must be 10 digit")
	private String mobile;
	
	@NotNull(message = "email should not be empty")
	@Email(message = "email can not be blank")
	private String email;
	
	@NotEmpty(message ="password should not be empty")
	@Size(min = 8,max = 10,message = "password size should be minmum 8 and maximum 10")
	private String password;
	
	@NotNull(message = "role can not be empty")
	private Users.Role role;
	
	public enum Role
	{
		admin,customer,service_provider;
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

	public UserDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Users.Role getRole() {
		return role;
	}

	public void setRole(Users.Role role) {
		this.role = role;
	}

	public UserDTO(@NotEmpty(message = "Name is Required") String name,
			@Size(min = 10, message = "contact must be 10 digit") String mobile,
			@NotEmpty(message = "email should not be empty") @Email(message = "email can not be blank") String email,
			@NotEmpty(message = "password should not be empty") @Size(min = 8, max = 10, message = "password size should be minmum 8 and maximum 10") String password,
			@NotEmpty(message = "role can not be empty") Users.Role role) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.email = email;
		this.password = password;
		this.role = role;
	}

	@Override
	public String toString() {
		return "UserDTO [name=" + name + ", mobile=" + mobile + ", email=" + email + ", password=" + password
				+ ", role=" + role + "]";
	}

}
