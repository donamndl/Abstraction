package com.java.TrainingSession.Abstraction;

abstract class Payment {    //Abstract Class
	abstract void Pay(int amount);    //Abstract Method
	public void receipt() {     //Concrete Method
		System.out.println("Receipt Generated");
	}
}
