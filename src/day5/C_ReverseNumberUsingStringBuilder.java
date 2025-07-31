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

	}

}
