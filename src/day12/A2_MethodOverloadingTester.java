package day12;

public class A2_MethodOverloadingTester {

	public static void main(String[] args) {

		A1_MethodOverloading a1 = new A1_MethodOverloading(1, "Virat", "Tech");
		a1.method();
		a1.method("hello");
		a1.method("Hello", "Dear");
		a1.method(2.7, "Virat", "Nihal");
		System.out.println(a1.method(4));
		a1.display();
		
		System.out.println("------------------------------------");

		A1_MethodOverloading a2 = new A1_MethodOverloading(2, "Nihal", "BA");
		a2.display();
	}

}
