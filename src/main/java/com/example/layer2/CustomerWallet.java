package com.example.layer2;


import javax.persistence.*;



/**
 * The persistent class for the CUSTOMER_WALLET database table.
 * 
 */
@Entity
@Table(name="CUSTOMER_WALLET")
@NamedQuery(name="CustomerWallet.findAll", query="SELECT c FROM CustomerWallet c")
public class CustomerWallet{

	@Column(name="REGISTERED_EMAIL")
	private String registeredEmail;

	@Column(name="WALLET_AMOUNT")
	private int walletAmount;
	
	@Id
	@Column(name="WALLET_ID")
	private String walletId;

	@Column(name="WALLET_PIN")
	private int walletPin;

	public CustomerWallet() {
	}

	public String getRegisteredEmail() {
		return this.registeredEmail;
	}

	public void setRegisteredEmail(String registeredEmail) {
		this.registeredEmail = registeredEmail;
	}

	public int getWalletAmount() {
		return this.walletAmount;
	}

	public void setWalletAmount(int walletAmount) {
		this.walletAmount = walletAmount;
	}

	public String getWalletId() {
		return this.walletId;
	}

	public void setWalletId(String walletId) {
		this.walletId = walletId;
	}

	public int getWalletPin() {
		return this.walletPin;
	}

	public void setWalletPin(int walletPin) {
		this.walletPin = walletPin;
	}

}