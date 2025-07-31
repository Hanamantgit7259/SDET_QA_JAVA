package day15;

public class a3_Tester {

	public static void main(String[] args) {

		// Parent Object and Parent Reference
		a1_RBI_Bank rb = new a1_RBI_Bank(500000.0, 10.0, 600000.0, 7, 1000000.0, 18, 450000.0, 11);

		System.out.println("DETAILS OF RBI BANK");

		System.out.println("Personnel Loan Total Amount in RBI : " + rb.persLoanMethod());

		System.out.println("Home Loan Total Amount in RBI : " + rb.HomeLoanMethod());

		System.out.println("Vehical Loan Total Amount in RBI : " + rb.vehicalLoanMethod());

		System.out.println("Education Loan Total Amount in RBI : " + rb.eduLoanMethod());

		System.out.println("--------------------------------------");
		// Parent Object - Child Reference: Child Methods are called (Overridden Methods
		// will be called)

		a1_RBI_Bank arb = new a2_AxisBank(500000.0, 10.0, 600000.0, 7, 1000000.0, 18, 450000.0, 11);

		System.out.println("DETAILS OF Axis Bank when RBI is a Reference");

		System.out.println("Personnel Loan Total Amount in Axis : " + arb.persLoanMethod());

		System.out.println("Home Loan Total Amount in Axis : " + arb.HomeLoanMethod());

		System.out.println("Vehical Loan Total Amount in Aix : " + arb.vehicalLoanMethod());

		System.out.println("Education Loan Total Amount in Axis : " + arb.eduLoanMethod());
		
		System.out.println("--------------------------------------");

		a2_AxisBank axi = new a2_AxisBank(500000.0, 10.0, 600000.0, 7, 1000000.0, 18, 450000.0, 11);

		System.out.println("DETAILS OF Axis Bank : ");

		System.out.println("Axis Bank Personnel loan interest rate : " + axi.axipersLoanInt);
		System.out.println("Personnel Loan Total Amount in Axis : " + axi.persLoanMethod());

		System.out.println("Axis Bank Home loan interest rate : " + axi.axihomeLoanInt);
		System.out.println("Home Loan Total Amount in Axis : " + axi.HomeLoanMethod());

		System.out.println("Axis Bank Vehical loan interest rate : " + axi.axiVehicalLoanInt);
		System.out.println("Vehical Loan Total Amount in Aix : " + axi.vehicalLoanMethod());

		System.out.println("Axis Bank Education loan interest rate : " + axi.axieduLoanInt);
		System.out.println("Education Loan Total Amount in Axis : " + axi.eduLoanMethod());

	}

}
