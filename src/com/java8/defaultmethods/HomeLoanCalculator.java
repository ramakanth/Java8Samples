package com.java8.defaultmethods;

public class HomeLoanCalculator implements FinacialCalculator{

	double processFee = 5000;
	double closingFee = 5000;
	double rateOfInterest = 10.00;
	
	@Override
	public double emiHasToPayEveryMonth(double amountOfLoan, int tenureIYears, String loanType) {
		double timeInMonths = tenureIYears*12.00;
		if(loanType.equals("H")) {
			double interest = LoanUtilityUtility.interestCalculate(amountOfLoan, tenureIYears, rateOfInterest) ;
			return (interest+amountOfLoan+ processFee + closingFee)/timeInMonths;
		}
		return -1;
	}

	@Override
	public double totalAmountToPay(double amountOfLoan, int tenureIYears, String loanType) {
		if(loanType.equals("H")) {
			
			double interest = LoanUtilityUtility.interestCalculate(amountOfLoan, tenureIYears, rateOfInterest) ;
			return (interest+amountOfLoan+ processFee + closingFee);
			
		}
		return -1;
	}

	@Override
	public double totalInterest(double amountOfLoan, int tenureIYears, String loanType) {
		if(loanType.equals("H")) {
			double interest = LoanUtilityUtility.interestCalculate(amountOfLoan, tenureIYears, rateOfInterest) ;
			return interest;
		}
		return -1;
	}


}
