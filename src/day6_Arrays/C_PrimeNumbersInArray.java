package day6_Arrays;

import java.util.Scanner;

public class C_PrimeNumbersInArray {

	public static void main(String[] args) {

		// int a[] = { 1, 2, 3, 4, 5, 6, 7, 9, 10 };

		// int num = 7;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of an array: ");
		int size = sc.nextInt();

		int num1[] = new int[size];

		System.out.println("Enter the values of the array: ");
		for (int k = 0; k < num1.length; k++) {
			num1[k] = sc.nextInt();
		}

		// int num1[] = { 1, 2, 3, 4, 5 };
		int count = 0;

		for (int j = 0; j < num1.length; j++) {

			if (num1[j] > 1) {

				for (int i = 1; i <= num1[j]; i++) {

					if (num1[j] % i == 0) {
						++count;
					}
				}

				if (count == 2) {
					System.out.println(num1[j] + " is a Prime Number ");

				} else {
					System.out.println(num1[j] + " Not a Prime Number ");
				}
				count = 0;
			} else {
				System.out.println(num1[j] + " Not a Prime Number ");
			}

		}
	}
}
