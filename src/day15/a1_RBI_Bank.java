package day15;

public class a1_RBI_Bank {

	double persLoan;
	double persLoanInt;

	double homeLoan;
	double homeLoanInt;

	double VehicalLoan;
	double VehicalLoanInt;

	double eduLoan;
	double eduLoanInt;
	
	 

	double total;

	public a1_RBI_Bank(double persLoan, double persLoanInt, double homeLoan, double homeLoanInt, double vehicalLoan,
			double vehicalLoanInt, double eduLoan, double eduLoanInt) {
		this.persLoan = persLoan;
		this.persLoanInt = persLoanInt;
		this.homeLoan = homeLoan;
		this.homeLoanInt = homeLoanInt;
		VehicalLoan = vehicalLoan;
		VehicalLoanInt = vehicalLoanInt;
		this.eduLoan = eduLoan;
		this.eduLoanInt = eduLoanInt;
	}

	public double persLoanMethod() {

		total = persLoan + (persLoan * 1 * persLoanInt) / 100;

		return total;
	}

	public double HomeLoanMethod() {

		total = homeLoan + (homeLoan * 1 * homeLoanInt) / 100;

		return total;
	}

	public double vehicalLoanMethod() {

		total = VehicalLoan + (VehicalLoan * 1 * VehicalLoanInt) / 100;

		return total;
	}

	public double eduLoanMethod() {

		total = eduLoan + (eduLoan * 1 * eduLoanInt) / 100;

		return total;
	}

}
