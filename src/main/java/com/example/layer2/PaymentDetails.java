package com.example.layer2;

import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the PAYMENT_DETAILS database table.
 * 
 */
@Entity
@Table(name="PAYMENT_DETAILS")
@NamedQuery(name="PaymentDetails.findAll", query="SELECT p FROM PaymentDetails p")
public class PaymentDetails{

	@Id
	@Column(name="PAYMENT_ID")
	private String paymentId;

	@Temporal(TemporalType.DATE)
	@Column(name="PAYMENT_DATE")
	private Date paymentDate;

	@Column(name="REGISTERED_EMAIL")
	private String registeredEmail;

	@Column(name="RESERVATION_ID")
	private String reservationId;

	@Column(name="TOTAL_AMOUNT_PAID")
	private int totalAmountPaid;

	@Column(name="UNREGISTERED_EMAIL")
	private String unregisteredEmail;

	public PaymentDetails() {
	}

	public String getPaymentId() {
		return this.paymentId;
	}

	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}

	public Date getPaymentDate() {
		return this.paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public String getRegisteredEmail() {
		return this.registeredEmail;
	}

	public void setRegisteredEmail(String registeredEmail) {
		this.registeredEmail = registeredEmail;
	}

	public String getReservationId() {
		return this.reservationId;
	}

	public void setReservationId(String reservationId) {
		this.reservationId = reservationId;
	}

	public int getTotalAmountPaid() {
		return this.totalAmountPaid;
	}

	public void setTotalAmountPaid(int totalAmountPaid) {
		this.totalAmountPaid = totalAmountPaid;
	}

	public String getUnregisteredEmail() {
		return this.unregisteredEmail;
	}

	public void setUnregisteredEmail(String unregisteredEmail) {
		this.unregisteredEmail = unregisteredEmail;
	}

}