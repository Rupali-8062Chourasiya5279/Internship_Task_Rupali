package com.quickservemain.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quickservemain.bloperation.AdminBl;
import com.quickservemain.dtoreponse.AdminDashboardResponse;
import com.quickservemain.dtoreponse.ApproveBusinessRes;
import com.quickservemain.dtoreponse.ShowAllUsersRes;
import com.quickservemain.dtoreponse.ShowBusiness;
import com.quickservemain.dtorequest.Data;

@RestController
@RequestMapping("/api/admin")
public class AdminController {
	
	@Autowired
	private AdminBl abl;

	@GetMapping("/dashboard")
	public ResponseEntity<?> dashboard()
	{
		Data d = abl.dashboard();
		if(d!=null)
		return ResponseEntity.status(HttpStatus.FOUND).body(new AdminDashboardResponse("success",d,200));
		else
		return ResponseEntity.status(HttpStatus.NO_CONTENT).body(new AdminDashboardResponse("failed",d,404));
	}
	
	@GetMapping("/users")
	public ResponseEntity<?> showallusers()
	{
		 ShowAllUsersRes sr = abl.showallusers();
		return ResponseEntity.status(HttpStatus.OK).body(sr);
	}
	
	@PostMapping("/approve-business/{businessid}")
	public ResponseEntity<?> approvebusiness(@PathVariable String businessid)
	{
		 ApproveBusinessRes abr = abl.approvebusiness(businessid);
		 return ResponseEntity.status(HttpStatus.OK).body(abr);
	}
	
	
	@PostMapping("/reject-business/{businessid}")
	public ResponseEntity<?> rejectbusiness(@PathVariable String businessid)
	{
		 ApproveBusinessRes abr = abl.rejectbusiness(businessid);
		 return ResponseEntity.status(HttpStatus.OK).body(abr);
	}
	
	@GetMapping("/businesses")
	public ResponseEntity<?> showBusiness()
	{
		 ShowBusiness sb = abl.showBusiness();
		 return ResponseEntity.status(HttpStatus.FOUND).body(sb);
	}
	
}
