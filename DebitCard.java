package com.java.TrainingSession.Abstraction;

public class DebitCard extends Payment{
	public void Pay(int amount) {
		System.out.println("Paid using Debit Card Rs. "+ amount);
	}
}
