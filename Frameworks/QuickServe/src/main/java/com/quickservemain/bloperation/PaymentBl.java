package com.quickservemain.bloperation;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quickservemain.dtoreponse.PaymentResponse;
import com.quickservemain.dtorequest.PaymentRequest;
import com.quickservemain.entities.Appointments;
import com.quickservemain.entities.Payments;
import com.quickservemain.entities.Payments.Status;
import com.quickservemain.repository.AppointmentRepository;
import com.quickservemain.repository.PaymentsRepository;

@Service
public class PaymentBl {
	
	@Autowired
	private PaymentsRepository preo;
	@Autowired
	private AppointmentRepository arepo;
	
	public PaymentResponse addPayment(PaymentRequest pr)
	{
		 Optional<Appointments> a = arepo.findById(pr.getAppointmentid().getAppointmentid());
		 if(a.isPresent())
		 {
			 Appointments a1 = a.get();
			 Payments p = new Payments();
			 p.setAmount(pr.getAmount());
			 p.setAppointmentid(a1);
			p.setPaymentmethod(pr.getPaymentmethod());
			p.setStatus(Status.paid);
			 preo.save(p);
			 return new PaymentResponse("success", "payment initiation successfully", p, 201); 
		 }
		 return new PaymentResponse("failed", "payment not initiated", null, 201);

	}

}
