package day5;

import java.util.Scanner;

public class D_SumOfNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");

		int num = sc.nextInt();
		int sum = 0;
		while (num != 0) {
			sum = sum + num % 10;
			num = num / 10;
		}
		System.out.println("The sum of numbers is : " + sum);
	}

}
