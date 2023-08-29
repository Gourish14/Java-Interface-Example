package com.cozentus.InterfaceExample;

public class Calculation implements Calculator {

	 public void Addition() {
		
		System.out.println("The Addition Abstract Method is executed !!");
	}
	public void Substraction() {
		
		System.out.println("The Substraction Abstract Method is executed !!");
	}
	
	public static void main (String [] args) {
		
		Calculation cal = new Calculation();
		cal.Addition();
		cal.Substraction();
	}
}
