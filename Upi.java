package com.java.TrainingSession.Abstraction;

public class Upi extends Payment{
	public void Pay(int amount) {
		System.out.println("Paid using UPI Rs. "+ amount);
	}
}
