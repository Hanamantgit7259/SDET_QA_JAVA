package day13;

public class A1_this_static {

	public static int srNo;
	static String orgname = "TCS";
	String name;
	double salary;
	String role;
	
/*	static {
		//srNo=srNo+1;
		System.out.println("Inside the static Block");
	}
*/
	public A1_this_static(String name, double salary, String role) {
		++srNo;
		this.name = name;
		this.salary = salary;
		this.role = role;
	}

	public void details() {
		
		//Static Methods Can be access inside the Non static 
//		System.out.println("Sr No: " + (srNo));
//		System.out.println("Organization Name : " + orgname);/
		System.out.println("Name : " + name);
		System.out.println("salary : " + salary);
		System.out.println("Role : " + role);
	}

	//static method()
	public static void AllDetails() {

		// if this static method is present in another class then use
		// classname.MethodName()
		System.out.println("Sr No: " + (srNo));
		System.out.println("Organization Name : " + orgname);
		

	}

}
