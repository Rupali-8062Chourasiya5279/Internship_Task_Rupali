package com.quickservemain.bloperation;

import com.quickservemain.dtoreponse.ServiceResponse;
import com.quickservemain.dtorequest.ServiceRequest;
import com.quickservemain.entities.Business;
import com.quickservemain.entities.Service;
import com.quickservemain.entities.SubCategories;
import com.quickservemain.repository.BusinessRepository;
import com.quickservemain.repository.SerivceRepository;
import com.quickservemain.repository.SubCategoriesRepository;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class ServiceBl {
	
	@Autowired
	private SerivceRepository srepo;
	@Autowired
	private BusinessRepository brepo;
	@Autowired
	private SubCategoriesRepository sbrepo;
	
	public ServiceResponse addService(ServiceRequest sreq)
	{
		Optional<Business> b = brepo.findById(sreq.getBusinessid().getBusinessid());
		Optional<SubCategories> s = sbrepo.findById(sreq.getSubcategoryid().getSubcategoryid());
		if(b.isPresent() && s.isPresent())
		{
			Business b1 = b.get(); 
			SubCategories s1 = s.get();
			Service sv = new Service();
			sv.setBusinessid(b1);
			sv.setSubcategoryid(s1);
			sv.setDescription(sreq.getDescription());
			sv.setPrice(sreq.getPrice());
			sv.setServicename(sreq.getServicename());
			srepo.save(sv);
			return new ServiceResponse("success", "service created successfully", sv, 200);
		}
		else
		{
			return new ServiceResponse("failed", "service not created", null, 200);
		}
			
	}

}
