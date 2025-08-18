package day3;

import java.util.Scanner;

public class B_SwappingWithout3rdVariable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 1 st value: : ");
		int x = sc.nextInt();

		System.out.println("Enter 1 st value: : ");
		int y = sc.nextInt();

		System.out.println("Values Before swapping X: " + x);
		System.out.println("Values Before swapping y: " + y);

		x = x + y; // 10+20=30
		y = x - y; // 30-20=10
		x = x - y; // 30-10=20

		System.out.println("Values After swapping X: " + x);
		System.out.println("Values After swapping y: " + y);

	}

}
