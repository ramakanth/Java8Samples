package com.java8.defaultmethods;

public class PersonalLoanCalculator implements FinacialCalculator{

	@Override
	public double emiHasToPayEveryMonth(double amountOfLoan, int tenureIYears, String loanType) {
		double emi = 15000;
		if(loanType.equals("P")) {
			return emi;
		}
		return -1;
	}

	@Override
	public double totalAmountToPay(double amountOfLoan, int tenureIYears, String loanType) {
		if(loanType.equals("P")) {
			double processFee = 5000;
			double closingFee = 5000;
			double rateOfInterest = 10.00;
			
			double amount = (amountOfLoan * tenureIYears * rateOfInterest)/100;
			double total = amount + processFee + closingFee;
			return total;
			
		}
		return -1;
	}

	@Override
	public double totalInterest(double amountOfLoan, int tenureIYears, String loanType) {
		double interest = 20000;
		if(loanType.equals("P")) {
			return interest;
		}
		return -1;
	}


	
}
