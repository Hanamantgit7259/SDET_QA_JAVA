package day7;

public class E3_ReverseArray {

	public static void main(String[] args) {

		int a[] = { 1, 2, 2, 4 };

		int b[] = new int[a.length];

		int k = 0;

		for (int i = a.length - 1; i>= 0; i--) {

			// b[i]=a[i];

			System.out.print((b[k] = a[i]) + " ");
			k++;
		}

		System.out.println();
		System.out.println("-------------------------");

		for (int j = 0; j < b.length; j++) {

			System.out.println(b[j] + " ");
		}
	}

}
