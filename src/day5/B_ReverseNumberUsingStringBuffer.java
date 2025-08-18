package day5;

import java.util.Scanner;

public class B_ReverseNumberUsingStringBuffer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");

		int num = sc.nextInt();
		StringBuffer sf = new StringBuffer(String.valueOf(num));
		StringBuffer rev = sf.reverse();

		System.out.println("The Reverse value is: " + rev);

	}

}
