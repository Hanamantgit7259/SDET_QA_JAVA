package day13;

public class A2_this_static_Tester {

	public static void main(String[] args) {

		A1_this_static a = new A1_this_static("Virat", 20.0, "Lead");
//		A1_this_static.orgname="infosys";
		A1_this_static.AllDetails();
		a.details();

		System.out.println("=================");
				
		A1_this_static b = new A1_this_static("Nihal", 20.0, "Lead");
		A1_this_static.orgname = "infosys";
		A1_this_static.AllDetails();
		b.details();

	}

/*	public static void All() {
		System.out.println("Sr No: " + ++ (A1_this_static.srNo));
		System.out.println("Organization Name : " + A1_this_static.orgname);
		
		A1_this_static x = new A1_this_static("Virat", 20.0, "Lead");
		A1_this_static.orgname="infosys";
 	
		System.out.println("Name : " +x. name);
		System.out.println("salary : " +x. salary);
		System.out.println("Role : " +x. role);
		 
	}
*/
}
