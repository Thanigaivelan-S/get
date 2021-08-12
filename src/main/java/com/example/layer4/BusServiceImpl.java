package com.example.layer4;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.layer2.BusJourneyDetails;
import com.example.layer2.BusSeatsDetails;
import com.example.layer2.CustomerWallet;
import com.example.layer2.PaymentDetails;
import com.example.layer2.ReservationDetails;
import com.example.layer2.TransactionDetails;
import com.example.layer2.ReservationDetails;
import com.example.layer3.BaseRepository;
import com.example.layer3.BusJourneyDetailsRepo;
import com.example.layer3.BusSeatDetailsRepo;
import com.example.layer3.CustomerWalletRepo;
import com.example.layer3.NumberNotFoundException;
import com.example.layer3.PaymentDetailsRepo;
import com.example.layer3.ReservationDetailsRepo;
import com.example.layer3.TransactionDetailsRepo;


@Service
public class BusServiceImpl implements BusService{
	
	 @Autowired 
	 BusJourneyDetailsRepo journeyDetailsRepo;
	  
	 @Autowired 
	 BusSeatDetailsRepo seatDetailsRepo;
	
	 @Autowired 
	 CustomerWalletRepo customerWalletRepo;
	 
	 @Autowired 
	 PaymentDetailsRepo paymentDetailsRepo;
	 
	 @Autowired
	 ReservationDetailsRepo reservationDetailsRepo;
	 
	 @Autowired
	 TransactionDetailsRepo transactionDetailsRepo;
	 
	/*
	 * @Autowired TransactionDetailsRepo transactionDetailsRepo;
	 */
	
		
		public void deleteReservation(String rID) throws NumberNotFoundException{
			System.out.println("deleteReservation...method ");
			try {
				reservationDetailsRepo.deleteReservation(rID);
				System.out.println("Reservation Deleted");
			} catch (NumberNotFoundException e) {
				e.printStackTrace();
			}
	}


		public void deleteTransaction(String rID) throws NumberNotFoundException {
			System.out.println("deleteTransaction...method ");
			try {
				transactionDetailsRepo.deleteTransaction(rID);
				System.out.println("Transaction Deleted");
			} catch (NumberNotFoundException e) {
				e.printStackTrace();
			}
		}
		
		public void deletePayment(String rID) throws NumberNotFoundException {
			System.out.println("deletePayment...method ");
			try {
				paymentDetailsRepo.deletePayment(rID);
				System.out.println("Payment Deleted");
			} catch (NumberNotFoundException e) {
				e.printStackTrace();
			}
		}
		
		public void addMoneyToWallet(String mailID) throws NumberNotFoundException{
			System.out.println("addMoneyWallet()");
			try {
				customerWalletRepo.addMoneyToWallet(mailID);
				System.out.println("Money Added to Wallet");
			}
			catch(NumberNotFoundException e) {
				e.printStackTrace();
			}
		}
		
		public void changeAvailableSeats(int jID,String rID) throws NumberNotFoundException{
			System.out.println("changeAvailableSeats");
			try {
				journeyDetailsRepo.changeAvailableSeats(jID,rID);
				System.out.println("Seats Count Changed");
			}
			catch(NumberNotFoundException e) {
				e.printStackTrace();
			}
		}
		
		public void updateSeatDetails(String rID) throws NumberNotFoundException{
			System.out.println("updateSeatDetails");
			try {
				seatDetailsRepo.updateSeatDetails(rID);
				System.out.println("Seats Details Changed");
			}
			catch(NumberNotFoundException e) {
				e.printStackTrace();
			}
		}


		public void cancelReservation(String email, int jID, String rID) {
			try {
			changeAvailableSeats(jID, rID);
			updateSeatDetails(rID);
			addMoneyToWallet(email);
			deleteTransaction(rID);
			deletePayment(rID);
			deleteReservation(rID);
			}
			catch(NumberNotFoundException e){
				e.printStackTrace();
			}
		}
}
