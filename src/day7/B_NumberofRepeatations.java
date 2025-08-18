package day7;

public class B_NumberofRepeatations {

	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40, 67 };
		int b[] = { 10, 20, 30, 20, 20, 10, 345, 10 };

		int count = 0;
		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < b.length; j++) {

				if (a[i] == b[j]) {
					++count;
				}

			}
			if (count >= 1) {
				System.out.println("The Number " + a[i] + " Repeated " + count + " Time ");
			} else {
				System.out.println("The Number " + a[i] + "  not repeated");
			}
			count = 0;
		}

	}

}
