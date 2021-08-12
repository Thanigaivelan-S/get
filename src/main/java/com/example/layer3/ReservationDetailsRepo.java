package com.example.layer3;

import org.springframework.stereotype.Repository;

@Repository
public interface ReservationDetailsRepo {
	void deleteReservation(String res) throws NumberNotFoundException;
}
