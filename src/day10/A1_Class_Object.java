package day10;

public class A1_Class_Object {

	public static void main(String[] args) {

		/*
		 * Here one data is printing 
		 * in another class and another data is current class
		 */
		A2_Student s1 = new A2_Student();
		s1.name = "Virat";
		s1.gender = 'M';
		s1.results = 'P';
		s1.display();
		System.out.println("Sr.No : " + ++(s1.srNo));
		System.out.println("name : " + s1.name);
		System.out.println("gender : " + s1.gender);
		System.out.println("Results : " + s1.results);

		System.out.println("================");

		A2_Student s2 = new A2_Student();
		s2.name = "Nihal";
		s2.gender = 'M';
		s2.results = 'P';
		s2.display();
		System.out.println("srNo : " + ++(s2.srNo));
		System.out.println("name : " + s2.name);
		System.out.println("gender : " + s2.gender);
		System.out.println("Results : " + s2.results);

		System.out.println("================");

		A2_Student s3 = new A2_Student();
		s3.name = "Laxmi";
		s3.gender = 'F';
		s3.results = 'P';
		s3.display();
		System.out.println("Sr.No : " + ++(s3.srNo));
		System.out.println("name : " + s3.name);
		System.out.println("gender : " + s3.gender);
		System.out.println("Results : " + s3.results);

	}

}
