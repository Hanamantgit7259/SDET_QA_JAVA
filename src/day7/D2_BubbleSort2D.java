package day7;

public class D2_BubbleSort2D {

	public static void main(String[] args) {

		int a[][] = { { 1, 7, 1, 5, 1 }, { 1, 2, 6, 5, 9 }, { 1, 3, 7, 9, 1 }, };

		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a[i].length; j++) {

				for (int k = 0; k < a.length; k++) {

					for (int m = 0; m < a[k].length - 1; m++) {

						if (a[k][m] > a[k][m + 1]) {

							int temp = a[k][m + 1];
							a[k][m + 1] = a[k][m];
							a[k][m] = temp;

						}

					}

				}
			}
		}

		System.out.println("After Sorting: ");

		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}
