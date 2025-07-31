package day3;

import java.util.Scanner;

public class A_swappingOf2Variables {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 1 st value: : ");
		int x = sc.nextInt();

		System.out.println("Enter 1 st value: : ");
		int y = sc.nextInt();

		System.out.println("Values Before swapping X: " + x);
		System.out.println("Values Before swapping y: " + y);

		int temp;
		temp = x;
		x = y;
		y = temp;

		System.out.println("Values After swapping X: " + x);
		System.out.println("Values After swapping y: " + y);

	}

}
