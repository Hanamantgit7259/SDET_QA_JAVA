package day2_day3;

import java.util.Scanner;

public class p4_WeekNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the week name: ");

		String week = sc.nextLine();
		switch (week) {
		case "Monday": {
			System.out.println("Day is Monday and Number is 1");
			break;
		}

		case "Tuesday": {
			System.out.println("Day is Tuesday and Number is 2");
			break;
		}

		case "Wednesday": {
			System.out.println("Day is Wednesday and Number is 3");
			break;
		}

		case "Thurday": {
			System.out.println("Day is Thurday and Number is 4");
			break;
		}
		case "Friday": {
			System.out.println("Day is Friday and Number is 5");
			break;
		}
		case "saturday": {
			System.out.println("Day is saturday and Number is 6");
			break;
		}

		default:
			System.out.println("Day is Sunday and Number is 7");
		}

	}

}
