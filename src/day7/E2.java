package day7;

public class E2 {

	public static void main(String[] args) {

		int a[] = { 1, 3, 4, 5, 3, 3, 3, 5, 0 };

		int target = 3;

		for (int i = 0; i < a.length-1; i++) {

			if (a[i] + a[i + 1] == target) {

				System.out.println("The values are: " + a[i] + "," + a[i + 1]);
			}

			//break;

		}
	}

}
