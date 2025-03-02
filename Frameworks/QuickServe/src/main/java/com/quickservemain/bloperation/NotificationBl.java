package com.quickservemain.bloperation;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quickservemain.dtoreponse.NotificationResponse;
import com.quickservemain.dtorequest.NotificationRequest;
import com.quickservemain.entities.Notifications;
import com.quickservemain.entities.Users;
import com.quickservemain.repository.NotificationRepository;
import com.quickservemain.repository.UserRepository;

@Service
public class NotificationBl {
	
	@Autowired
	private NotificationRepository nr;
	@Autowired
	private UserRepository ur;
	
	public NotificationResponse addNotification(NotificationRequest nreq)
	{
		Optional<Users> u =ur.findById(nreq.getUserid().getUserid());
		if(u.isPresent())
		{
			Notifications n = new Notifications();
			Users u1 =u.get();
			n.setMessage(nreq.getMessage());
			n.setUserid(u1);
			nr.save(n);
			return new NotificationResponse("success", "notification sent successfully", n, 201);
		}
		else
		{
			return new NotificationResponse("failed", "notification not sent", null, 404);
		}
	}

}
