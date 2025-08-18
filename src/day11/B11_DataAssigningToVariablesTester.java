package day11;

public class B11_DataAssigningToVariablesTester {

	public static void main(String[] args) {

		// Through constructor
		System.out.println("Assigning Values Through constructor ");
		B1_DataAssigningToVariables a = new B1_DataAssigningToVariables("laxmi", 5, 25000.00);
		a.printDetails();

		System.out.println("==============================");
		B1_DataAssigningToVariables a2 = new B1_DataAssigningToVariables("Hanamant", 5, 25000.00);
		a2.printDetails();

		System.out.println("==============================");
		// Directly assigning values to variables
		System.out.println("Directly assigning values to variables");
		a.srNo = 1;
		a.name = "Virat";
		a.age = 2;
		a.salary = 2000.143;
		a.printDetails();

		System.out.println("==============================");

		a.srNo = 1;
		a.name = "Kohli";
		a.age = 4;
		a.salary = 2020.143;
		a.printDetails();

		a.srNo=0;
		System.out.println("============================");

		// Through Methods
		System.out.println("Assigning values through method");
		a.method("Nihal", 7, 30000.0);
		a.printDetails();

		System.out.println("==============================");
		a.method("Ganga", 7, 80000.0);
		a.printDetails();

	}

}
