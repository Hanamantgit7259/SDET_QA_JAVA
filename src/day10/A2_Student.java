package day10;

public class A2_Student {

	String relation = "Siblings";
	// static is used since its a common for all the instances
	// this will work whenever we create an object for the class
	static int srNo;

//	static int srNo=1;

	String name;
	char gender;
	char results;

	/*
	 * static { srNo++; }
	 */
	void display() {
		System.out.println("within strudent class");
		System.out.println("Sr No   : " + ++srNo);
		System.out.println("Name    : " + name);
		System.out.println("Gender  : " + gender);
		System.out.println("Relation  : " + relation);
		System.out.println("Results : " + results);
		System.out.println("=======================");
	}
}
