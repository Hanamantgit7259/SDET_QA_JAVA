package day7;

public class D4_MissingNumber {

	public static void main(String[] args) {

		// Should not contain any duplicate values
		// Array can be in any order
		// Values should be in range
		// Hint sum=sum2-sum1
		// sum1=sum of all the given numbers
		// sum 2= sum of digits from starting to ending

		int a[] = { 8, 9, 10, 11, 13, 14, 15, 16 };
		int sum1 = 0;

		for (int i = 0; i < a.length; i++) {

			sum1 = sum1 + a[i];
		}

		int sum2 = 0;
		for (int i = 8; i <= 16; i++) {

			sum2 = sum2 + i;
		}

		System.out.println("Sum of All the digits : " + sum1);
		System.out.println("Sum of All the digits including missing : " + sum2);
		System.out.println("Missing Number is : " + (sum2 - sum1));
	}

}
