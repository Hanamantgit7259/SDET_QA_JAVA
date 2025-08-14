package day4;

import java.util.Scanner;

public class A1_SwitchCase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Select the Food that you wnat to order :");
		String food = sc.nextLine();

		switch (food) {

		case "Idly": {
			System.out.println("Customer wants Idly");
			break;
		}
		case "Upma": {
			System.out.println("Customer wants Upma");
			break;
		}
		case "Dosa": {
			System.out.println("Customer wants dosa");
			break;
		}

		case "Poha": {
			System.out.println("Customer wants Poha");
		}

		default: {

			System.out.println("Sever default Vada");

		}

		}
	}
}