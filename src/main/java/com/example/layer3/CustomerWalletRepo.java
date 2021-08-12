package com.example.layer3;

import org.springframework.stereotype.Repository;

@Repository
public interface CustomerWalletRepo {
	void addMoneyToWallet(String mailID) throws NumberNotFoundException;
}
