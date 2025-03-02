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

import com.quickservemain.bloperation.BusinessBl;
import com.quickservemain.dtoreponse.BusinessReponse;
import com.quickservemain.dtoreponse.UserResponse;
import com.quickservemain.dtorequest.BusinessReq;
import com.quickservemain.entities.Business;

import jakarta.validation.Valid;

@RestController
@RequestMapping("api/business")
public class BusinessController {
	
	@Autowired
	private BusinessBl bbl;
	
	@PostMapping("/register")
	public ResponseEntity<?> register(@Valid @RequestBody BusinessReq brq)
	{
		 BusinessReponse br = bbl.register(brq);
		 return ResponseEntity.status(HttpStatus.CREATED).body(br);
	}
	
	@GetMapping("/{businessid}")
	public ResponseEntity<?> showById(@PathVariable String businessid)
	{
		Optional<Business> op = bbl.showBusiness(businessid);
		if(op.isPresent())
		{
			Business b = op.get();
			return ResponseEntity.status(HttpStatus.FOUND).body(new BusinessReponse("success", "watching business successfully", b, 200));
		}
		else
		return ResponseEntity.status(HttpStatus.FOUND).body(new BusinessReponse("success", "watching business successfully", op, 200));
	}
	
	@PutMapping("/{businessid}")
	public ResponseEntity<?> updateById(@RequestBody BusinessReq bq,@PathVariable String businessid)
	{
		 BusinessReponse br = bbl.updateBusiness(bq,businessid);
		 return ResponseEntity.status(HttpStatus.OK).body(br);
	}
	
	@DeleteMapping("/{businessid}")
	public ResponseEntity<?> deleteBusiness(@PathVariable String businessid)
	{
		BusinessReponse br = bbl.deleteByBusinessId(businessid);
		return ResponseEntity.status(HttpStatus.OK).body(br);
		
	}
	
}
