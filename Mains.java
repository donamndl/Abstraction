package com.java.TrainingSession.Abstraction;

public class Mains {
	public static void main(String args[]) {
		DebitCard dc = new DebitCard();
		dc.Pay(100);
		Upi u = new Upi();
		u.Pay(200);
	}
	
}
