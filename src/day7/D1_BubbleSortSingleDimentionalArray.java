package day7;

public class D1_BubbleSortSingleDimentionalArray {

	public static void main(String[] args) {

		int a[] = { 1, 4, 0, 2, 5, 2, 6, 3, 73, 4, 68, 5, 5, 3, 54, 66, 45, 64, 35, 5, 356, };
		System.out.println("Before Sorting");

		for (int beforeSorting : a) {
			System.out.print(beforeSorting + " ");
		}
		System.out.println();
		;
		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a.length - 1; j++) {

				if (a[j] > a[j + 1]) {

					int temp = a[j + 1];
					a[j + 1] = a[j];
					a[j] = temp;
				}
			}
		}

		System.out.println("After Sorting");

		for (int j = 0; j < a.length; j++) {
			System.out.print(a[j] + " ");
		}
	}

}
