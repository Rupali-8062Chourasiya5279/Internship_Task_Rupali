package com.quickservemain.dtorequest;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class UserLoginReq {
	
	
	@NotNull(message = "email can not be empty.")
	@Email(message = "follow the email pattern")
	private String email;
	
	@NotNull(message = "password can not be null")
	@Size(min = 8,max = 10,message = "password lenght atleast 8 and atmost 10")
	private String password;

	public UserLoginReq() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserLoginReq(
			@NotNull(message = "email can not be empty.") @Email(message = "follow the email pattern") String email,
			@NotNull(message = "password can not be null") @Size(min = 8, max = 10, message = "password lenght atleast 8 and atmost 10") String password) {
		super();
		this.email = email;
		this.password = password;
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

	@Override
	public String toString() {
		return "UserLoginReq [email=" + email + ", password=" + password + "]";
	}

}
