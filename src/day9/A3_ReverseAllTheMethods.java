package day9;

public class A3_ReverseAllTheMethods {

	public static void main(String[] args) {

		// Approach 1
		String a = "Welcome";
		String rev = "";
		for (int i = a.length() - 1; i >= 0; i--) {

			rev = rev + a.charAt(i);

		}
		System.out.println("Reverse Using First Method Approach : " + rev);

		// Approach 2
		String ab = "RamSiyaRam";
		char c[] = ab.toCharArray();
		String rev2 = "";
		for (int i = c.length - 1; i >= 0; i--) {

			rev2 = rev2 + c[i];
		}
		System.out.println("Reverse Using 2nd char Approach : " + rev2);

		// Approach 3
		// String v="Hello";
		StringBuffer sf = new StringBuffer("Hello Dear");
		StringBuffer rev3 = sf.reverse();
		System.out.println("Reverse Using 3rd StringBuffer Approach : " + rev3);

		// Approach 4
		String vv = "Bangalore";
		StringBuilder sb = new StringBuilder(vv);
		StringBuilder rev4 = sb.reverse();
		
		System.out.println("Reverse Using 3rd String Builder Approach : " + rev4);

	}

}
