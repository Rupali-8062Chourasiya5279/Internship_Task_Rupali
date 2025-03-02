package com.quickservemain.dtorequest;

import java.math.BigDecimal;

import com.quickservemain.entities.Appointments;
import com.quickservemain.entities.Payments.PaymentMethod;

import jakarta.persistence.Enumerated;

public class PaymentRequest {
	private Appointments appointmentid;
	private BigDecimal amount;
	private PaymentMethod paymentmethod;
	public PaymentRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PaymentRequest(Appointments appointmentid, BigDecimal amount, PaymentMethod paymentmethod) {
		super();
		this.appointmentid = appointmentid;
		this.amount = amount;
		this.paymentmethod = paymentmethod;
	}
	public Appointments getAppointmentid() {
		return appointmentid;
	}
	public void setAppointmentid(Appointments appointmentid) {
		this.appointmentid = appointmentid;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public PaymentMethod getPaymentmethod() {
		return paymentmethod;
	}
	public void setPaymentmethod(PaymentMethod paymentmethod) {
		this.paymentmethod = paymentmethod;
	}
	@Override
	public String toString() {
		return "PaymentRequest [appointmentid=" + appointmentid + ", amount=" + amount + ", paymentmethod="
				+ paymentmethod + "]";
	}
}
