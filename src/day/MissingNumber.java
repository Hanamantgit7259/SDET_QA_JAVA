package day;

import java.util.Scanner;

public class MissingNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array: ");

		int size = sc.nextInt();
		int a[] = new int[size];

		System.out.println("Enter the array values: ");

		for (int i = 0; i < a.length; i++) {

			System.out.println("Enter the value at index : " + i);
			a[i] = sc.nextInt();

		}

		for (int j = 0; j < a.length; j++) {
			System.out.print(a[j] + "  ");
		}
		System.out.println();
		// missing Number:
		int sumArray = 0;
		for (int k = 0; k < a.length; k++) {

			sumArray = sumArray + a[k];
		}

		int min = a[0];

		for (int l = 0; l < a.length; l++) {

			if (a[l] < min) {
				min = a[l];
			}
		}

		System.out.println("Minimum value : " + min);

		int max = a[0];

		for (int s = 0; s < a.length; s++) {

			if (a[s] > max) {
				max = a[s];
			}
		}

		System.out.println("Maximaum value : " + max);

		// missing number
		int rangeValue = 0;

		for (int h = min; h <= max; h++) {

			rangeValue = rangeValue + h;
		}

		int arrayValue = 0;

		for (int r = 0; r < a.length; r++) {
			arrayValue = arrayValue + a[r];
		}

		int missingNumber = rangeValue - arrayValue;
		System.out.println("Missing Number is : " + missingNumber);
	}

}
