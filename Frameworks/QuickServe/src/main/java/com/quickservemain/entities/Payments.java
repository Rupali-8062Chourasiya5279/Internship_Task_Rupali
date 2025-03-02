package com.quickservemain.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "payments")
public class Payments {
	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "paymentid")
	private String paymentid;
	
	@ManyToOne
	@JoinColumn(name = "appointmentid",referencedColumnName = "appointmentid",nullable = false)
	private Appointments appointmentid;
	
	@Column(name = "amount",precision = 6,scale = 2,nullable = false)
	private BigDecimal amount;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "paymentmethod",nullable = false)
	private PaymentMethod paymentmethod;
	@Enumerated(EnumType.STRING)
	@Column(name = "status",nullable = false)
	private Status status;
	
	@Column(name = "createdat",nullable = false,updatable = false)
	private LocalDateTime createdat;
	
	@Column(name = "updatedat",nullable = false)
	private LocalDateTime updatedat;
	
	@PrePersist
	public void onprepersist()
	{
		this.createdat=LocalDateTime.now();
		this.updatedat=LocalDateTime.now();
	}
	
	public enum PaymentMethod
	{
		cash,upi,card;
	}
	public enum Status
	{
		paid,failed,refund;
	}
	public Payments() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Payments(Appointments appointmentid, BigDecimal amount, PaymentMethod paymentmethod, Status status,
			LocalDateTime createdat, LocalDateTime updatedat) {
		super();
		this.appointmentid = appointmentid;
		this.amount = amount;
		this.paymentmethod = paymentmethod;
		this.status = status;
		this.createdat = createdat;
		this.updatedat = updatedat;
	}
	public String getPaymentid() {
		return paymentid;
	}
	public void setPaymentid(String paymentid) {
		this.paymentid = paymentid;
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
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public LocalDateTime getCreatedat() {
		return createdat;
	}
	public void setCreatedat(LocalDateTime createdat) {
		this.createdat = createdat;
	}
	public LocalDateTime getUpdatedat() {
		return updatedat;
	}
	public void setUpdatedat(LocalDateTime updatedat) {
		this.updatedat = updatedat;
	}
	@Override
	public String toString() {
		return "Payments [paymentid=" + paymentid + ", appointmentid=" + appointmentid + ", amount=" + amount
				+ ", paymentmethod=" + paymentmethod + ", status=" + status + ", createdat=" + createdat
				+ ", updatedat=" + updatedat + "]";
	}


}
