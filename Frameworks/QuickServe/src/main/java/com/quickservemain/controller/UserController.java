package com.quickservemain.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quickservemain.bloperation.UserBl;
import com.quickservemain.dtoreponse.AdminDashboardResponse;
import com.quickservemain.dtoreponse.ShowAllUsersRes;
import com.quickservemain.dtoreponse.UserResponse;
import com.quickservemain.dtorequest.UserDTO;
import com.quickservemain.entities.Users;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	private UserBl ubl;
	
	@GetMapping("/users")
	public ResponseEntity<?> showallusers()
	{
		 ShowAllUsersRes sr = ubl.showallusers();
		return ResponseEntity.status(HttpStatus.OK).body(sr);
	}

	@PostMapping("/users")
	public ResponseEntity<?> addUser(@Valid  @RequestBody UserDTO udto)
	{
		Users u = ubl.addUser(udto);
		return ResponseEntity.status(HttpStatus.CREATED).body(new UserResponse("success","user register successfully",u));
	}
	
	@GetMapping("/users/{userid}")
	public ResponseEntity<?> showallusers(@PathVariable String userid)
	{
		Users u = ubl.showByUserId(userid);
		return ResponseEntity.status(HttpStatus.OK).body(new AdminDashboardResponse("success", u, 200));
	}
	
	@PutMapping("/users/{userid}")
	public ResponseEntity<?> UdateUser(@Valid  @RequestBody UserDTO udto)
	{
		Users u = ubl.updateUser(udto);
		return ResponseEntity.status(HttpStatus.OK).body(new UserResponse("success","user updated successfully",u));
	}
	
	@DeleteMapping("/users/{userid}")
	public ResponseEntity<?> deleteUser(@PathVariable String userid)
	{
		UserResponse ur = ubl.deleteByUserId(userid);
		return ResponseEntity.status(HttpStatus.OK).body(ur);
		
	}
}
