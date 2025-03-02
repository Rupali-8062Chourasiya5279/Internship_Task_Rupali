package com.quickservemain.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quickservemain.bloperation.NotificationBl;
import com.quickservemain.dtoreponse.NotificationResponse;
import com.quickservemain.dtorequest.NotificationRequest;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/notifications")
public class NotificationController {
	
	@Autowired
	private NotificationBl nbl;
	
	@PostMapping("/send")
	public ResponseEntity<?> addNotification(@Valid @RequestBody NotificationRequest nreq)
	{
	NotificationResponse nr =	nbl.addNotification(nreq);
	return ResponseEntity.status(HttpStatus.OK).body(nr);
	}

}
