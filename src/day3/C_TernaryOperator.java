package day3;

import java.util.Scanner;

public class C_TernaryOperator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 1 st value : ");
		int x = sc.nextInt();

		System.out.println("Enter 1 st value : ");
		int y = sc.nextInt();

		String results = x > y ? x + "is greater" : y + " y is greater";
		System.out.println(results);
	}

}
