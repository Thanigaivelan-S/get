package com.example.layer2;


import javax.persistence.*;;


/**
 * The persistent class for the BUS_JOURNEY_DETAILS database table.
 * 
 */
@Entity
@Table(name="BUS_JOURNEY_DETAILS")
@NamedQuery(name="BusJourneyDetails.findAll", query="SELECT b FROM BusJourneyDetails b")
public class BusJourneyDetails{

	@Id
	@Column(name="JOURNEY_ID")
	private int journeyId;

	@Column(name="ARRIVAL_TIME")
	private String arrivalTime;
	
	@Column(name="AVAILABLESEATES")
	private int availableseates;

	@Column(name="BUS_NO")
	private String busNo;

	@Column(name="DEPARTURE_TIME")
	private String departureTime;

	@Column(name="DESTINATION_LOC")
	private String destinationLoc;

	@Column(name="SOURCE_LOC")
	private String sourceLoc;

	public BusJourneyDetails() {
	}

	public BusJourneyDetails(String busNo) {
		// TODO Auto-generated constructor stub
		this.busNo=busNo;
	}

	public int getJourneyId() {
		return this.journeyId;
	}

	public void setJourneyId(int journeyId) {
		this.journeyId = journeyId;
	}

	public String getArrivalTime() {
		return this.arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public int getAvailableseates() {
		return this.availableseates;
	}

	public void setAvailableseates(int availableseates) {
		this.availableseates = availableseates;
	}

	public String getBusNo() {
		return this.busNo;
	}

	public void setBusNo(String busNo) {
		this.busNo = busNo;
	}

	public String getDepartureTime() {
		return this.departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public String getDestinationLoc() {
		return this.destinationLoc;
	}

	public void setDestinationLoc(String destinationLoc) {
		this.destinationLoc = destinationLoc;
	}

	public String getSourceLoc() {
		return this.sourceLoc;
	}

	public void setSourceLoc(String sourceLoc) {
		this.sourceLoc = sourceLoc;
	}
}
