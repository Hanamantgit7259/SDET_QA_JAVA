package day5;

import java.util.Scanner;

public class i_Numbers_even_odd {

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the Number : ");

//		int num = sc.nextInt();
		
		int num=1234;
		// Total Numbers:
		// x out of Total Y Number are even
		// x out of Total Y Number are odd
		int count = 0;
		int even = 0;
		int odd = 0;
		int digit=0;

		while (num != 0) {

			count++;
			digit=num%10;
			num=num/10;

			if (digit % 2 == 0) {
				even++;
			} else {
				odd++;
			}

		}

		System.out.println("Total Numbers : " +count);
		System.out.println(even + "out of " + count + " are even");    
		System.out.println(odd + " out of " + odd + " are odd");
	}

}
