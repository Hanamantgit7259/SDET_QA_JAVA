package day12;

public class B2_EnacapsulationTester {

	public static void main(String[] args) {

		B1_Encapsulation b1 = new B1_Encapsulation();

		// Setters
		b1.setSrNo(1);
		b1.setName("Virat");
		b1.setDept("Techincal");

		// Getters
		System.out.println(b1.getSrNo());
		System.out.println(b1.getName());
		System.out.println(b1.getDept());

		b1.details();

	}

}
