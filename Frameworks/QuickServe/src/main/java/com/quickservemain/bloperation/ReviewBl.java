package com.quickservemain.bloperation;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.quickservemain.dtoreponse.ReviewResponse;
import com.quickservemain.dtorequest.ReviewRequest;
import com.quickservemain.entities.Reviews;
import com.quickservemain.entities.Users;
import com.quickservemain.repository.ReviewsRepository;
import com.quickservemain.repository.SerivceRepository;
import com.quickservemain.repository.UserRepository;

@Service
public class ReviewBl {
	
	@Autowired
	private ReviewsRepository rr;
	@Autowired
	private SerivceRepository sr;
	@Autowired
	private UserRepository ur;
	
	public ReviewResponse addReview(@RequestBody ReviewRequest rreq)
	{
		Optional<com.quickservemain.entities.Service> s=sr.findById(rreq.getServiceid().getServiceid());
		Optional<Users> u=ur.findById(rreq.getUserid().getUserid());
		if(s.isPresent() && u.isPresent())
		{
			Reviews r = new Reviews();
			com.quickservemain.entities.Service s1 =s.get();
			Users u1= u.get();
			r.setServiceid(s1);
			r.setComment(rreq.getComment());
			r.setRating(rreq.getRating());
			r.setUserid(u1);
			rr.save(r);
			return new ReviewResponse("success", "review submited successfully", r, 201);
		}
		else
		{
			return new ReviewResponse("failed", "review not submited", null, 201);
		}
	}

}
