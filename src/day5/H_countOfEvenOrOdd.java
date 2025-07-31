package day5;

import java.util.Scanner;

public class H_countOfEvenOrOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = sc.nextInt();
		int count = 0;
		int digit = 0;

		int evn = 0;
		int evA = -1;
		int ev[] = {};

		int odd = 0;
		int odA = -1;
		int od[] = {};

		while (num != 0) {
			++count;
			digit = num % 10;
			if (digit % 2 == 0) {
				++evn;
				++evA;
				ev[evA] = digit;

			} else {
				++odd;
				++odA;
				od[odA] = digit;
			}
			num = num / 10;
		}
		System.out.println("Total count : " + count);
		System.out.println("Number of Even Numbers: " + evn);

		System.out.println("Even Number are: ");

/*		for (int i = 0; i < ev.length; i++) {
			System.out.print(ev[i] + "  ");
		}
		System.out.println("Odd Number are: ");

		for (int j = 0; j < od.length; j++) {
			System.out.print(od[j] + "  ");
		}
*/
		for(int c: ev) {
			System.out.println(c);
		}
	}

}
