package com.java8.defaultmethods;

public class LoanUtilityUtility {
	
	public static double  interestCalculate(double primeAmt,double tenureYears, double rateOfinterest) {
		double timeInMonths = tenureYears*12.00;
		double amount = (primeAmt * timeInMonths * rateOfinterest)/100.00;
		return amount;
	}
	
	public static void main(String[] args) {
		double amount = LoanUtilityUtility.interestCalculate(200000, 10.00, 9.99);
		System.out.println("Total amount :  "+amount);
		
	}
}
