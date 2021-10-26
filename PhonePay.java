package com.xworkz.polymorphism;

public class PhonePay {

	public void recharge(String dishName,String subscriberID, double amount) {
		System.out.println("DTH is payed for id " + subscriberID+ " successfully");

	}

	public void recharge( long phoneNumber, String simName, int amount) {
		System.out.println("recharged to "+ phoneNumber + " of " + amount + "rs successfully");

	}

}
