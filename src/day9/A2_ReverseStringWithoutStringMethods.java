package day9;

import java.util.Arrays;

public class A2_ReverseStringWithoutStringMethods {

	public static void main(String[] args) {

		String a = "Welcome";
		char c[] = a.toCharArray();
		// System.out.println(Arrays.toString(c));

		String rev = "";
		for (int i = c.length - 1; i >= 0; i--) {

			rev = rev + c[i];

		}

		System.out.println("Reverse Array : " + rev);
	
	 
	
	
	
	
	}

}
