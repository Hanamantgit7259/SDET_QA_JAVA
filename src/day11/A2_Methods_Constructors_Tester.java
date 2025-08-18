package day11;

public class A2_Methods_Constructors_Tester {

	public static void main(String[] args) {

		A1_Methods_Constructors a = new A1_Methods_Constructors();
		a.NoBoth();
		a.YesParaNoReturn("Virat");
		String value = a.NoParaYesReturn();
		System.out.println(" Value " + value);

		String yes = a.YesParaYesReturn("Nihal");

		System.out.println("Yes Para & Yes Return : " + yes);
	}

}
