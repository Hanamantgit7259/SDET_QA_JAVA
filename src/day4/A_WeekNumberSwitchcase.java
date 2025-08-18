package day4;

import java.util.Scanner;

public class A_WeekNumberSwitchcase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Day name: ");
		String day = sc.nextLine();

		switch (day) {
		case "Monday": {
			System.out.println("Number is 1");
			break;
		}

		case "Tuesday": {
			System.out.println("Number is 2");
			break;

		}

		case "Wednesday": {
			System.out.println("Number is 3");
			break;
		}

		case "Thursday": {
			System.out.println("Number is 4");
			break;
		}

		case "Friday": {
			System.out.println("Number is 5");
			break;
		}
		case "Saturday": {
			System.out.println("Number is 6");
			break;
		}
		default:
			System.out.println("Number is 7");

		}

	}

}
