package com.example.layer3;

import org.springframework.stereotype.Repository;

@Repository
public interface TransactionDetailsRepo {
	void deleteTransaction(String traID) throws NumberNotFoundException;
}
