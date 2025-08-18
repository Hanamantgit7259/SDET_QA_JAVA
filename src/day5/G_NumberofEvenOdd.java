package day5;

import java.util.Scanner;

//import dg;

public class G_NumberofEvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");

		int num = sc.nextInt();
		int count = 0;
		// int rev=0;
		int even = 0;
		int odd = 0;
		int digit = 0;
		int evnArray = 0;
		// int evnnum = 0;
		int ev[] = {};

		// int oddd = 0;
		int oddnum = 0;
		int od[] = {};

		while (num != 0) {
			count++;
			digit = num % 10;
			num = num / 10;
			if (digit % 2 == 0) {
				 
				ev[count-1] = digit;

			} else {
				++odd;
				++oddnum;
				od[oddnum - 1] = digit;

			}
		}
		System.out.println("Number of digits: " + count);
		System.out.println("Number of Even digits: " + even);
		System.out.println("Number of Odd digits: " + odd);

		// Number of even digits:
		// System.out.println("Number of even digits" + ev.length);

		// Even digits are
		for (int i = even; i < ev.length; i++) {
			System.out.println("Even Numbers are : " + ev[even]);
		}
/*		// Number of odd digits:
		System.out.println("Number of even digits" + od.length);

		// Even digits are

		for (int j = 0; j < od.length; j++) {
			System.out.println("odd Numbers are : " + od[j]);
		}
*/
	}

}
