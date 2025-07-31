package day9;

import java.util.Arrays;

public class B1_mutable_sample {

	public static void main(String[] args) {

		int a[] = { 10, 20, 12, 34, 5, 6, 5, 6 };
		System.out.println(Arrays.toString(a));
		Arrays.sort(a); //Mutable--we can change the value
		System.out.println(Arrays.toString(a));
	}

}
