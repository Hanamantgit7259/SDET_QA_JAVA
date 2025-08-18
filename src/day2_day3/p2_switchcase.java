package day2_day3;

import java.util.Scanner;

public class p2_switchcase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Food you want: ");

		String food = sc.nextLine();

		switch (food) {

		case "Idly": {
			System.out.println("Hey take your food: " + food);
			break;
		}

		case "Puri": {
			System.out.println("Hey take your food: " + food);
			break;
		}

		case "Dosa": {
			System.out.println("Hey take your food: " + food);
			break;
		}
		default:
			System.out.println("Hey take your food:" + food);

		}

	}

}
