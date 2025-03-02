package com.quickservemain.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.quickservemain.bloperation.UserBl;
import com.quickservemain.dtoreponse.UserLoginRes;
import com.quickservemain.dtoreponse.UserLogoutRes;
import com.quickservemain.dtoreponse.UserResponse;
import com.quickservemain.dtoreponse.VerifyEmailRes;
import com.quickservemain.dtorequest.UserDTO;
import com.quickservemain.dtorequest.UserLoginReq;
import com.quickservemain.entities.Users;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/auth")
public class AuthenticateController {
	
	@Autowired
	private UserBl ubl;

	@PostMapping("/register")
	public ResponseEntity<?> registerUser(@Valid  @RequestBody UserDTO udto)
	{
		Users u = ubl.registerUser(udto);
		return ResponseEntity.status(HttpStatus.CREATED).body(new UserResponse("success","user register successfully",u));
	}
	
	@PostMapping("/login")
	public ResponseEntity<?> loginUser(@Valid @RequestBody UserLoginReq ulr)
	{
		try 
		{
			UserLoginRes ur = ubl.login(ulr);
		return ResponseEntity.status(HttpStatus.OK).body(ur);
		}
		catch (Exception e) {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(new UserLoginRes("Failed", "incorrect cradentials ", 401));
		}
	}
	
	@PostMapping("/logout")
	public ResponseEntity<?> logoutUser(HttpServletRequest request)
	{
		ubl.logout(request);
		return ResponseEntity.status(HttpStatus.LOCKED).body(new UserLogoutRes("success", "logout successfully", 200));
	}
	
	@GetMapping("/verify-email/{email}")
	public ResponseEntity<?> verifyEmail(@PathVariable String email)
	{
		 boolean b = ubl.verifyemail(email);
		 if(b)
		 {
			 return ResponseEntity.status(HttpStatus.FOUND).body(new VerifyEmailRes("success", "Email verified successfully", 200));
		 }
		 else
		 {
			 return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new VerifyEmailRes("not found", "Failed to verify Email", 404));
		 }
	}
	
}
