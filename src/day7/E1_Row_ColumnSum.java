package day7;

public class E1_Row_ColumnSum {

	public static void main(String[] args) {

		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int rowSum = 0;
		int colSum = 0;

		// Row
		for (int i = 0; i < a.length; i++) {
			// Column
			for (int j = 0; j < a[i].length; j++) {

				rowSum = rowSum + a[i][j];

			}
			System.out.println("The Sum of Row " + (i) + " is " + rowSum);
			rowSum = 0;

		}
		// Column
		for (int m = 0; m < a[0].length; m++) {

			// Row
			for (int k = 0; k < a.length; k++) {

				colSum = colSum + a[k][m];
			}
			System.out.println("The Sum of coulmn " + (m) + " is " + colSum);
			colSum = 0;

		}

	}

}
