package day12;

public class A1_MethodOverloading {

	int srNo;
	String name;
	String dept;

	// Constructor overloading
	A1_MethodOverloading(int srNo, String name, String dept) {
		this(name, dept);
		this.srNo=srNo;
	}

	A1_MethodOverloading(String name, String dept) {
		this.name = name;
		this.dept = dept;

	}

	// MethodOverloading
	public void method() {
		System.out.println();
	}

	public void method(String a) {
		System.out.println("Single paraMeter : " + a);
	}

	public void method(String a, String b) {
		System.out.println("Double paraMeter : " + a + "  " + b);

	}

	public void method(double a, String b, String c) {
		System.out.println("Three paraMeter : " + a + "  " + b);
	}

	public int method(int x) {

		return x;
	}
	
	public void display() {
		System.out.println("Sr No : " + srNo);
		System.out.println("Name : " + name);
		System.out.println("Dept : "+ dept);
		srNo++;
	}
}
