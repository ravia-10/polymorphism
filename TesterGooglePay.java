package com.xworkz.polymorphism;

public class TesterGooglePay {

	public static void main(String[] args) {
		GooglePay googlePay = new GooglePay();
		googlePay.billPayment("Bn122992", 189.082);
		googlePay.billPayment( "sbi", 2782.00, 256473899263l);
	}

}
