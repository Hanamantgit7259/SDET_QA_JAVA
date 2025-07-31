package day6_Arrays;

import java.util.Scanner;

public class A_1D {

	public static void main(String[] args) {

		// 1D Array
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array: ");

		int row = sc.nextInt();
		int a[] = new int[row];
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter the value of " + i + " index");
			a[i] = sc.nextInt();
		}

		// Size of array:
		System.out.println("size of an array : " + a.length);

		// Printing Particular values:
		System.out.println("Printing particular vales: " + a[2]);

		// Printing All the values
		System.out.println("Printing all the values in For loop");
		for (int j = 0; j < a.length; j++) {
			System.out.print(a[j] + " ");
		}
		System.out.println();
		// For each loop
		System.out.println("Printing all the values in For Each loop");

		for (int c : a) {
			System.out.print(c + " ");
		}

	}

}
