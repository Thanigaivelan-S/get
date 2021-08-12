package com.example.layer4;

import org.springframework.stereotype.Service;

import com.example.layer2.ReservationDetails;
import com.example.layer3.NumberNotFoundException;

@Service
public interface BusService {
	void deleteReservation(String rID) throws NumberNotFoundException;
	void deleteTransaction(String rID) throws NumberNotFoundException;
	void deletePayment(String rID) throws NumberNotFoundException;
	void addMoneyToWallet(String mailID) throws NumberNotFoundException;
	void changeAvailableSeats(int jID,String rID) throws NumberNotFoundException;
	void updateSeatDetails(String rID) throws NumberNotFoundException;
	void cancelReservation(String email, int jID, String rID) throws NumberNotFoundException;
}
