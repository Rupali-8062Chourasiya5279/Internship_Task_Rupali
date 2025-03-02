package com.quickservemain.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quickservemain.bloperation.ServiceBl;
import com.quickservemain.dtoreponse.ServiceResponse;
import com.quickservemain.dtorequest.ServiceRequest;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api")
public class ServiceController {
	
	@Autowired
	private ServiceBl sbl;

	@PostMapping("/services")
	public ResponseEntity<?> addService(@Valid @RequestBody ServiceRequest sreq)
	{
		ServiceResponse sr = sbl.addService(sreq);
		return ResponseEntity.status(HttpStatus.CREATED).body(sr);
	}
}
