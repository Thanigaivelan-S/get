package com.example.layer3;

import org.springframework.stereotype.Repository;

import com.example.layer2.BusJourneyDetails;
@Repository
public interface BusJourneyDetailsRepo {
	void changeAvailableSeats(int jID, String rID) throws NumberNotFoundException;
}
