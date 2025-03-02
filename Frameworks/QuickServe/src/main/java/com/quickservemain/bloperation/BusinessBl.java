package com.quickservemain.bloperation;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.quickservemain.dtoreponse.BusinessReponse;
import com.quickservemain.dtoreponse.UserResponse;
import com.quickservemain.dtorequest.BusinessReq;
import com.quickservemain.entities.Business;
import com.quickservemain.entities.Users;
import com.quickservemain.repository.BusinessRepository;
import com.quickservemain.repository.UserRepository;

@Service
public class BusinessBl {

	@Autowired
	private BusinessRepository brepo;
	@Autowired
	private UserRepository urepo;
	
	public BusinessReponse register(BusinessReq brq) {
		Users u = urepo.findById(brq.getUserid().getUserid()).get();
		Business b = new Business();
		b.setUserid(u);
		b.setBusinessname(brq.getBusinessname());
		b.setContactinfo(brq.getContactinfo());
		b.setLogourl(brq.getLogourl());
		b.setAddress(brq.getAddress());
		brepo.save(b);
		return new BusinessReponse("success","business saved successfully", b, 200);	
	}
	
	public Optional<Business> showBusiness(String businessid)
	{
		 Optional<Business> b = brepo.findById(businessid);
		return b;
	}
	
	public BusinessReponse updateBusiness(BusinessReq bq,String businessid) {
		Business b = brepo.findById(businessid).get();
		System.out.println(b);
		b.setBusinessname(bq.getBusinessname());
		b.setAddress(bq.getAddress());
		b.setContactinfo(bq.getContactinfo());
		b.setLogourl(bq.getLogourl());
		brepo.save(b);
		return new BusinessReponse("success","business updated successfully", b, 200);	
	}
	
	public BusinessReponse deleteByBusinessId(String businessid)
	{
		Optional<Business> u = brepo.findById(businessid);
		if(u.isPresent())
		{
		brepo.deleteById(u.get().getBusinessid());
		return new BusinessReponse("success", "business deleted successfully", u, 200);
		}
		return new BusinessReponse("failed", "failed to delete business", u, 400);
	}

}
