package com.quickservemain.bloperation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.quickservemain.dtoreponse.ApproveBusinessRes;
import com.quickservemain.dtoreponse.ShowAllUsersRes;
import com.quickservemain.dtoreponse.ShowBusiness;
import com.quickservemain.dtorequest.Data;
import com.quickservemain.entities.Appointments.Status;
import com.quickservemain.entities.Business;
import com.quickservemain.entities.Users;
import com.quickservemain.repository.AppointmentRepository;
import com.quickservemain.repository.BusinessRepository;
import com.quickservemain.repository.UserRepository;

@Service
public class AdminBl {
	
	@Autowired
	private UserRepository urepo;
	@Autowired
	private BusinessRepository brepo;
	@Autowired
	private AppointmentRepository arepo;
	
	public Data dashboard()
	{
		long totaluser  = urepo.count();
		long totalbusiness = brepo.count();
		long totalactivebooking = arepo.countByStatus(Status.book);
		return  new Data(totaluser, totalbusiness, totalactivebooking);
	}
	
	

	public ShowAllUsersRes showallusers() {
		List<Users> l =urepo.findAll();
		return new ShowAllUsersRes("success", l, 200);	
	}
	
	
	public ApproveBusinessRes approvebusiness(String businessid)
	{
		Optional<Business> b = brepo.findById(businessid);
		if(b.isPresent())
		{
			return new ApproveBusinessRes("success","Business Approved", 200);
		}
		else
		{
			return new ApproveBusinessRes("failed", "Not Approved", 400);
		}
	}
	
	public ApproveBusinessRes rejectbusiness(String businessid)
	{
		Optional<Business> b = brepo.findById(businessid);
		if(b.isPresent())
		{
			return new ApproveBusinessRes("success","Business Rejected successfully", 200);
		}
		else
		{
			return new ApproveBusinessRes("failed", "Not Rejected", 400);
		}
	}
	
	public ShowBusiness showBusiness()
	{
		List<Business> l = brepo.findAll();
		System.out.println(l);
		return  new ShowBusiness("success", l, 200);
	}

}
