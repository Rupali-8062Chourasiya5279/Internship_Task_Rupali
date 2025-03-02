package com.quickservemain.bloperation;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.quickservemain.dtoreponse.AppointmentResponse;
import com.quickservemain.dtorequest.AppointmentRequest;
import com.quickservemain.entities.Appointments;
import com.quickservemain.entities.Appointments.Status;
import com.quickservemain.entities.Users;
import com.quickservemain.repository.AppointmentRepository;
import com.quickservemain.repository.SerivceRepository;
import com.quickservemain.repository.UserRepository;

@Service
public class AppointmentBl {
	
	@Autowired
	private AppointmentRepository arepo;
	@Autowired
	private UserRepository urepo;
	@Autowired
	private SerivceRepository srepo;
	
	public AppointmentResponse addAppointment(AppointmentRequest ar)
	{
		 Optional<Users> u = urepo.findById(ar.getUserid().getUserid());
		 Optional<com.quickservemain.entities.Service> s = srepo.findById(ar.getServiceid().getServiceid());
		 if(u.isPresent() && s.isPresent())
		 {
			 Users u1 = u.get();
			 com.quickservemain.entities.Service s1 = s.get();
			 Appointments a = new Appointments();
			 a.setServiceid(s1);
			 a.setUserid(u1);
			 a.setAppointmentdate(ar.getAppointmentdate());
			 a.setTimeslot(ar.getTimeslot());
			 a.setStatus(Status.book);
			 arepo.save(a);
			 return new AppointmentResponse("success", "Appointment Booked successfully", a, 201);
		 }
		 else
			 {
			 return new AppointmentResponse("Failed", "Appointment Not Booked ", null, 401);
			 }
	}
}
