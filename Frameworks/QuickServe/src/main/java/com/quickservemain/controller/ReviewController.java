package com.quickservemain.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quickservemain.bloperation.ReviewBl;
import com.quickservemain.dtoreponse.ReviewResponse;
import com.quickservemain.dtorequest.ReviewRequest;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api")
public class ReviewController {
	
	@Autowired
	private ReviewBl rbl;
	
	@PostMapping("/reviews")
	public ResponseEntity<?> addReview(@Valid @RequestBody ReviewRequest rreq)
	{
		System.out.println(rreq.getComment());
		System.out.println(rreq.getUserid().getUserid());
		System.out.print(rreq.getServiceid().getServiceid());
		ReviewResponse r = rbl.addReview(rreq);
		return ResponseEntity.status(HttpStatus.OK).body(r);
	}

}
