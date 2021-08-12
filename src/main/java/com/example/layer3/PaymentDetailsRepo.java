package com.example.layer3;

import org.springframework.stereotype.Repository;

@Repository
public interface PaymentDetailsRepo {
	void deletePayment(String pID) throws NumberNotFoundException;
}
