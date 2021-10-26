package com.xworkz.polymorphism;

public class TesterPhonePay {

	public static void main(String[] args) {
		PhonePay phonePay = new PhonePay();
		phonePay.recharge(986674653, "jio",199);
		phonePay.recharge( "airtel", "art1234",1092.3);
	}

}
