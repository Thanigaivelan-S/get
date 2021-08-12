package com.example.layer2;


import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the TRANSACTION_DETAILS database table.
 * 
 */
@Entity
@Table(name="TRANSACTION_DETAILS")
@NamedQuery(name="TransactionDetails.findAll", query="SELECT t FROM TransactionDetails t")
public class TransactionDetails {

	@Id
	@Column(name="TRANSACTION_ID")
	private String transactionId;

	@Column(name="PAYMENT_ID")
	private String paymentId;

	@Column(name="REGISTERED_EMAIL")
	private String registeredEmail;

	@Column(name="RESERVATION_ID")
	private String reservationId;

	@Temporal(TemporalType.DATE)
	@Column(name="TRANSACTION_DATE")
	private Date transactionDate;

	@Column(name="UNREGISTERED_EMAIL")
	private String unregisteredEmail;

	public TransactionDetails() {
	}

	public String getTransactionId() {
		return this.transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getPaymentId() {
		return this.paymentId;
	}

	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
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

	public Date getTransactionDate() {
		return this.transactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}

	public String getUnregisteredEmail() {
		return this.unregisteredEmail;
	}

	public void setUnregisteredEmail(String unregisteredEmail) {
		this.unregisteredEmail = unregisteredEmail;
	}
}