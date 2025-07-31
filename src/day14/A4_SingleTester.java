package day14;

public class A4_SingleTester {

	public static void main(String[] args) {

		// Child class Object accessing both child and parent object directly 
		A3_Single_Child c = new A3_Single_Child("Father", "Subahs", 35, "Son", "Virat", 2);
		System.out.println("Child Details :-------------");
		System.out.println(c.relation);
		System.out.println(c.childName);
		System.out.println(c.cage);
		c.childMethod();
	    
		System.out.println("Parent Details From Child Object:-------------");
		System.out.println(c.prelation);
		System.out.println(c.parentName);
		System.out.println(c.page);
		c.parentMethod();
		
		
		//Parent class Object --Call only parent variable and methods
		System.out.println("parent Method Details ");
		A2_SingIe_Parent p = new A2_SingIe_Parent("parent","UTB",36);
		System.out.println(p.prelation);
		System.out.println(p.parentName);
		System.out.println(p.page);
		
		//Parent class object and child class reference
		//All the Methods and variables of parent and only Overridden methods of child class
	 	A2_SingIe_Parent cp = new A3_Single_Child("Father", "Subahs", 35, "Son", "UTB", 8);
	 	System.out.println("parent Object and child reference Details ");
	 System.out.println(cp.page);
	 System.out.println(cp.parentName);
	 System.out.println(cp.prelation);
	 cp.parentMethod();
		
		
		

	}

}
