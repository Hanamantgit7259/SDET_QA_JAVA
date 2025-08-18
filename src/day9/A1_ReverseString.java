package day9;

import java.util.Scanner;

public class A1_ReverseString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value: ");
		String a = sc.nextLine();
		System.out.println("The Entered value : " + a);
		String rev = "";
		for (int i = a.length() - 1; i >= 0; i--) {

			rev = rev + a.charAt(i);

		}

		System.out.println("Reverse Value: " + rev);

		int num = 1234;
		int revNum = 0;
		while (num > 0) {
			revNum = revNum * 10 + num % 10;
			num = num / 10;

		}
		System.out.println("Reverse Number : " + revNum);

		int num1=12345;
		int sum = 0;
		while (num1 > 0) {

			 sum=sum+num1%10;
			 num1=num1/10;
		}
		System.out.println("Sum of the Number : " + sum);
	}

}
