package day7;

public class D3_Max_Min_value_InArray {
//updated based on Yogi sir's logic on second highest value,,and min is still the same..
	public static void main(String[] args) {

		int a[] = { 1, 3, 1, 34, 56, 74, 44, 99 };

		int max = a[0];
		int min = a[0];
		int secondlargest = a[0];

		for (int i = 1; i < a.length; i++) {

			if (a[i] > max) {
				secondlargest = max;
				max = a[i];

			} else if (a[i] < max && a[i] > secondlargest) {
				secondlargest = a[i];

			}
		}
		System.out.println("Maximum value : " + secondlargest);

		for (int j = 1; j < a.length; j++) {

			if (a[j] < min) {
				min = a[j];
			}
		}
		System.out.println("Maximum value : " + min);
	}

}
