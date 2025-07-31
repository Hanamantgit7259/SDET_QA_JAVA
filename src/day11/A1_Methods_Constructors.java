package day11;

public class A1_Methods_Constructors {

	// No para-No Return

	public void NoBoth() {
		System.out.println("I'am no Para and Return");
	}

	// Yes Para-No Return
	public void YesParaNoReturn(String name) {
		System.out.println("para and No Return and my name is : " + name);
	}

	// No para Yes Return
	public String NoParaYesReturn() {
		System.out.println("No Para and Yes Return");
		return "Hello";
	}

	// Yes Return and yes para
	public String YesParaYesReturn(String Nihal) {
		System.out.println("Yes Para and Yes Return and my name is : ");
		return "Hello";
	}

}
