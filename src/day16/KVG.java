package day16;

public class KVG implements RBI {

	/*
	 * double a; double b;
	 * 
	 * public KVG(double pri, double time) { this.a = pri; this.b = time; }
	 */
	@Override
	public void personnelLoan(double a, double b) {

		System.out.println("Personnel Loan Calculation : ");
		System.out.println("Total AMount Sactioned : " + a);
		System.out.println("Rate of Interest : " +(pl+1));
		

		double interest = (a * b * ((pl + 1))) / 100;

		System.out.println("Total Interest for " + b + " years is : " + interest);
		
		System.out.println("Total Interest Paid per year : " + (interest/b));

		double total = a + interest;
		System.out.println("Total Amount is : " + total);
		System.out.println("===========================================================");

	}

	@Override
	public void homeLoan(double a, double b) {
		System.out.println("Home Loan Calculation : ");
		System.out.println("Total Amount Sactioned : " + a);
		System.out.println("Rate of Interest : " +(hl+2));

		double interest = (a * b * ((hl + 2))) / 100;

		System.out.println("Total Interest for " + b + " years is : " + interest);
		System.out.println("Total Interest Paid per year : " + (interest/b));

		double total = a + interest;
		System.out.println("Total Amount is : " + total);
		System.out.println("===========================================================");
	}

	@Override
	public void goldLoan(double a, double b) {
		System.out.println("Gold Loan Calculation : ");
		System.out.println("Total Amount Sactioned : " + a);
		System.out.println("Rate of Interest : " +(gl-1));

		double interest = (a * b * ((gl - 1))) / 100;

		System.out.println("Total Interest for " + b + " years is : " + interest);
		System.out.println("Total Interest Paid per year : " + (interest/b));

		double total = a + interest;
		System.out.println("Total Amount is : " + total);

		System.out.println("===========================================================");
	}

	@Override
	public void VehicalLoan(double a, double b) {
		System.out.println("Vehical Loan Calculation : ");
		System.out.println("Total Amount Sactioned : " + a);
		System.out.println("Rate of Interest : " +(vl+4));

		double interest = (a * b * ((vl + 4))) / 100;

		System.out.println("Total Interest for " + b + " years is : " + interest);
		System.out.println("Total Interest Paid per year : " + (interest/b));

		double total = a + interest;
		System.out.println("Total Amount is : " + total);

		System.out.println("===========================================================");
	}

}

/*  class Tester {

	public static void main(String[] args) {

		RBI b = new KVG();
		b.personnelLoan(600000, 5);
		b.homeLoan(50000, 4);
		b.VehicalLoan(300000, 7);
		b.goldLoan(400000, 6);

	}
}
*/