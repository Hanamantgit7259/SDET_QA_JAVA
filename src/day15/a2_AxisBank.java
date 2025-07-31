package day15;

public class a2_AxisBank extends a1_RBI_Bank {

	double axipersLoanInt = 16;
	 

	double axihomeLoanInt = 9;

	double axiVehicalLoanInt = 21;

	double axieduLoanInt = 13;

	double axitotal;

	public a2_AxisBank(double persLoan, double persLoanInt, double homeLoan, double homeLoanInt, double vehicalLoan,
			double vehicalLoanInt, double eduLoan, double eduLoanInt) {
		super(persLoan, persLoanInt, homeLoan, homeLoanInt, vehicalLoan, vehicalLoanInt, eduLoan, eduLoanInt);
	 
	}

	@Override
	public double persLoanMethod() {
		axitotal = persLoan + (persLoan * 1 * axipersLoanInt) / 100;

		return axitotal;
	}

	@Override
	public double HomeLoanMethod() {
		axitotal = homeLoan + (homeLoan * 1 * axihomeLoanInt) / 100;

		return axitotal;
	}

	@Override
	public double vehicalLoanMethod() {
		axitotal = VehicalLoan + (VehicalLoan * 1 * axiVehicalLoanInt) / 100;

		return axitotal;
	}

	@Override
	public double eduLoanMethod() {
		total = eduLoan + (eduLoan * 1 * axieduLoanInt) / 100;

		return axitotal;
	}

}
