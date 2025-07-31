package day10;

public class A3_MethodParaMeterReturnvalueTester {

	public static void main(String[] args) {

		A3_MethodParaMeterReturnvalue a1 = new A3_MethodParaMeterReturnvalue();
		a1.m1();

		String a2Value = a1.m2();
		System.out.println("No Para but Return " + a2Value);

		a1.m3("Sending value m3..");

		int results = a1.m4(4, 6);
		System.out.println("Addition Results : " + results);
	}

}
