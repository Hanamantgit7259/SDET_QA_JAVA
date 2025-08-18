package day8;

import java.util.Arrays;
import java.util.Scanner;

public class A1_SplitMethods {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the data: ");

		String s = sc.nextLine();
		System.out.println("Enter the Delimeter to split : ");

		String delimeter = sc.nextLine();

		String[] sp = s.split(delimeter);
		 

//		for (int i = 0; i < sp.length; i++) {
//
//			System.out.println(sp[i]);
//		}

		System.out.println("Enter the Delimeter to split : ");
		String delimeter2 = sc.nextLine();
		String sp1[] = sp[1].split(delimeter2);
//		for (int j = 0; j < sp2.length; j++) {
//			System.out.println(sp2[j]);
//		}
//
		System.out.println("After the First Split : " + Arrays.toString(sp));
		System.out.println("After the 2nd Split : " + Arrays.toString(sp1));
	}
}
