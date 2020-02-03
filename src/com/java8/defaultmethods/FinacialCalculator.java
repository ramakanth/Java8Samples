package com.java8.defaultmethods;

public interface FinacialCalculator {

	public double emiHasToPayEveryMonth(double amountOfLoan, int tenureIYears, String loanType);

	public double totalAmountToPay(double amountOfLoan, int tenureIYears, String loanType);

	public double totalInterest(double amountOfLoan, int tenureIYears, String loanType);

	
	
	
	// If a personal wants to take the insurance
	default double insuranceToPayOneTime(double amountOfLoan, int tenureIYears, String loanType) {
		if (loanType.equals("H")) {
			return 20000;
		} else if (loanType.equals("P")) {
			return 20000;
		} else {
			return -1;
		}
	}

	// If a personal wants to take the insurance and calculate per month
	default double insuranceToPayByEMI(double amountOfLoan, int tenureIYears, String loanType) {
		if (loanType.equals("H")) {
			return 20000;
		} else if (loanType.equals("P")) {
			return 20000;
		} else {
			return -1;
		}
	}

	// processing charges based on tenure
	default double processingFeeByDuration(double amountOfLoan, int tenureIYears, String loanType) {
		if (loanType.equals("H")) {
			return 20000;
		} else if (loanType.equals("P")) {
			return 10000;
		} else {
			return -1;
		}
	}
	// closing charges based on tenure
	default double closingFeeByDuration(double amountOfLoan, int tenureIYears, String loanType) {
		if (loanType.equals("H")) {
			return 10000;
		} else if (loanType.equals("P")) {
			return 5000;
		} else {
			return -1;
		}
	}
}
