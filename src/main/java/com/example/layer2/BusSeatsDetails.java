package com.example.layer2;


import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the BUS_SEATES_DETAILS database table.
 * 
 */
@Entity
@Table(name="BUS_SEATES_DETAILS")
@NamedQuery(name="BusSeatsDetails.findAll", query="SELECT b FROM BusSeatsDetails b")
public class BusSeatsDetails{
	
	@Id
	@Column(name="SEAT_NO")
	private String seatNo;
	
	@Column(name="JOURNEY_ID")
	private int journeyId;

	@Column(name="RESERVATION_ID")
	private String reservationId;
	
	

	public BusSeatsDetails() {
	}

	public int getJourneyId() {
		return this.journeyId;
	}

	public void setJourneyId(int journeyId) {
		this.journeyId = journeyId;
	}

	public String getReservationId() {
		return this.reservationId;
	}

	public void setReservationId(String reservationId) {
		this.reservationId = reservationId;
	}

	public String getSeatNo() {
		return this.seatNo;
	}

	public void setSeatNo(String seatNo) {
		this.seatNo = seatNo;
	}

}