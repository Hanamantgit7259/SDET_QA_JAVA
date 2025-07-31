package day2_day3;

import java.util.Scanner;

public class p1_IfElse {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Value of a: ");
		int a = sc.nextInt();

		System.out.println("Enter the Value of b: ");
		int b = sc.nextInt();

		System.out.println("Enter the Value of c: ");
		int c = sc.nextInt();

		if (a > b && a > c) {
			System.out.println("A is greater and the values is : " + a);
		} else if (b > a && b > c) {
			System.out.println("B is greater and the values is : " + b);
		} else {
			System.out.println("C is greater and the value is: " + c);
		}

	}

}
