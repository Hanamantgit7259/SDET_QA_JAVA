package day7;

import java.util.Scanner;

public class C_NumberOFRepeataionsIn2DArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

	/*	System.out.println("Enter the Row: ");
		int row = sc.nextInt();

		System.out.println("Enter the column: ");
		int col = sc.nextInt();

		int a[][] = new int[3][5];

		System.out.println("Enter the array values: ");

		for (int m = 0; m < a.length; m++) {

			for (int c = 0; c < a[m].length; m++) {
				a[m][c] = sc.nextInt();
			}
			System.out.println();
		}
*/
	 int a[][] = { { 10, 1, 2,30,50 }, { 4, 2, 6,4,3,6,3,5 }, { 7, 3, 9 } };

		int b[][] = a;

		int count = 0;

		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a[i].length; j++) {

				for (int k = 0; k < b.length; k++) {

					for (int l = 0; l < b[k].length; l++) {

						if (a[i][j] == b[k][l]) {
							++count;
						}

					}
					if (count >= 1) {
						System.out.println("The Number " + a[i][j] + " Repeated " + count + " Times");
						count = 0;
					}

				}

			}

		}

	}

}
