package day16_Interface_abstract;

public class Tester {

	public static void main(String[] args) {
		 
		//sc1
		A obj1 = new D();
		 obj1.m1();
		 obj1.m2();
		 A.m3();
		 
		 //sc2:
		B obj2 = new D(); 
		obj2.m1();
		obj2.m2();
		obj2.m4();
		obj2.m5();
		System.out.println(B.c);
		System.out.println(B.d);
		
		//sc3
		C obj3 = new D();
		obj3.m1();
		obj3.m2();
		obj3.m4();
		obj3.m5();
		
		System.out.println(obj3.ab);
		System.out.println(obj3.cd);
		
		//sc4
		D obj4 = new D();
		 System.out.println(obj4.ab);
		 System.out.println(obj4.cd);
		 obj4.m1();
		 obj4.m2();
		 obj4.m4();
		 obj4.m5();
		
		
		 
		 
		 

	}

}
