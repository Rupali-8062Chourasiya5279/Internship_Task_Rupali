package com.quickservemain.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quickservemain.bloperation.PaymentBl;
import com.quickservemain.dtoreponse.PaymentResponse;
import com.quickservemain.dtorequest.PaymentRequest;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/payment")
public class PaymentController {
	
	@Autowired
	private PaymentBl pbl;

	@PostMapping("/initiate")
	public ResponseEntity<?> addPayment(@RequestBody PaymentRequest pr)
	{
		PaymentResponse p =  pbl.addPayment(pr);
		return ResponseEntity.status(HttpStatus.OK).body(p);
	}
}
