package com.xworkz.polymorphism;

public class GooglePay {
	//String waterMeterID;

	public void billPayment(String waterMeterID, double amount) {
		System.out.println("water bill payed "+ waterMeterID+ " successfully");

	}

	public void billPayment(String companyName, String billID, double amount) {
		System.out.println("Electricity  bill payed to" + billID+ " successfully");

	}

	public void billPayment(String simName, int phoneNumber, double amount) {
		System.out.println(" recharged successfully to " +phoneNumber);

	}

	public void billPayment(String cardName, double amount,long cardNumber) {
		System.out.println(" credit bill payed successfully to " +cardNumber);

	}

	
}
