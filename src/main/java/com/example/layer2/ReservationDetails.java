package com.example.layer2;


import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the RESERVATION_DETAILS database table.
 * 
 */
@Entity
@Table(name="RESERVATION_DETAILS")
@NamedQuery(name="ReservationDetails.findAll", query="SELECT r FROM ReservationDetails r")
public class ReservationDetails{
	

	@Id
	@Column(name="RESERVATION_ID")
	private String reservationId;

	@Temporal(TemporalType.DATE)
	@Column(name="DEPARTURE_DATE")
	private Date departureDate;
	
	@Column(name="DRIVERLESS")
	private String driverless;

	@Column(name="JOURNEY_ID")
	private int journeyId;

	@Column(name="REGISTERED_EMAIL")
	private String registeredEmail;

	@Temporal(TemporalType.DATE)
	@Column(name="RESERVATION_DATE")
	private Date reservationDate;

	@Column(name="RESERVATION_TIME")
	private String reservationTime;

	@Column(name="SEATS_BOOKED")
	private int seatsBooked;

	@Column(name="UNREGISTERED_EMAIL")
	private String unregisteredEmail;

	public ReservationDetails() {
	}

	public String getReservationId() {
		return this.reservationId;
	}

	public void setReservationId(String reservationId) {
		this.reservationId = reservationId;
	}

	public Date getDepartureDate() {
		return this.departureDate;
	}

	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}

	public String getDriverless() {
		return this.driverless;
	}

	public void setDriverless(String driverless) {
		this.driverless = driverless;
	}

	public int getJourneyId() {
		return this.journeyId;
	}

	public void setJourneyId(int journeyId) {
		this.journeyId = journeyId;
	}

	public String getRegisteredEmail() {
		return this.registeredEmail;
	}

	public void setRegisteredEmail(String registeredEmail) {
		this.registeredEmail = registeredEmail;
	}

	public Date getReservationDate() {
		return this.reservationDate;
	}

	public void setReservationDate(Date reservationDate) {
		this.reservationDate = reservationDate;
	}

	public String getReservationTime() {
		return this.reservationTime;
	}

	public void setReservationTime(String reservationTime) {
		this.reservationTime = reservationTime;
	}

	public int getSeatsBooked() {
		return this.seatsBooked;
	}

	public void setSeatsBooked(int seatsBooked) {
		this.seatsBooked = seatsBooked;
	}

	public String getUnregisteredEmail() {
		return this.unregisteredEmail;
	}

	public void setUnregisteredEmail(String unregisteredEmail) {
		this.unregisteredEmail = unregisteredEmail;
	}

}