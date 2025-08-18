package day5;

import java.util.Scanner;

public class E_Palindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");

		int num1 = sc.nextInt();

		int num = num1;

		int rev = 0;
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		if (num1 == rev) {
			System.out.println("The Number is palindrome");
		} else {
			System.out.println("The number is not a palindrome");
		}
	}

}
