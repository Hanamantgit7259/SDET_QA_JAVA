package day7;

public class A_LinearSearch {

	public static void main(String[] args) {

		int a[] = { 10, 20, 30, 40 };

		int search = 40;
		boolean status = false;
		for (int i = 0; i < a.length; i++) {

			if (a[i] == search) {
				System.out.println("Number Found at the index of : " + i);
				status = true;

			}
		}
		if (status == false)

		{
			System.out.println("Number Not found Found ");
		}

	}

}
