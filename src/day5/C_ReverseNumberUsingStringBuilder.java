package day5;

import java.security.spec.DSAParameterSpec;
import java.util.Scanner;

public class C_ReverseNumberUsingStringBuilder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");

		int num = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		StringBuilder ap = sb.append(num);
		StringBuilder rev = ap.reverse();
		System.out.println("The Reverse Number is: " + rev);
		
		//approach 2
		int num2=1234;
		
		StringBuilder sbb = new StringBuilder(String.valueOf(num2));
		StringBuilder revcd =sbb.reverse();
		String data=revcd.toString();		        
		int reversedd=Integer.parseInt(data);
		System.out.println("Reverse Number is : "+reversedd );

	}

}
