package com.quickservemain.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quickservemain.bloperation.AppointmentBl;
import com.quickservemain.dtoreponse.AppointmentResponse;
import com.quickservemain.dtorequest.AppointmentRequest;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api")
public class AppointmentController {
	
	@Autowired
	private AppointmentBl abl;
	
	@PostMapping("/appointments")
	public ResponseEntity<?> addAppointment(@Valid @RequestBody AppointmentRequest ar)
	{
		 AppointmentResponse apres = abl.addAppointment(ar);
		 return ResponseEntity.status(HttpStatus.OK).body(apres);
	}

}
