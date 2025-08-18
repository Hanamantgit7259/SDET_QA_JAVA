package day7;

import java.util.Arrays;

public class C_SortingUsingInBuiltMethod {

	public static void main(String[] args) {
		int a[] = { 10, 9, 82, 23, 48, 93, 134, 3, 3 };

		// Before Sorting Integer:
		System.out.println("Before sorting ");
		System.out.println(Arrays.toString(a));

		// After Sorting Integer:
		System.out.println("After sorting ");
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));

		System.out.println("Strings Sorting ");

		String name[] = { "Virat", "Laxmi", "Nihal", "Basu", "shivu", "Subhas", "Uday", "Ganga" };
		System.out.println("Before String sorting ");
		// System.out.println(Arrays.to);
		for (String beforeSort : name) {
			System.out.print(beforeSort + "  ");
		}
		System.out.println();

		Arrays.sort(name);
		System.out.println("After String sorting ");
		for (String AfterSort : name) {
			System.out.print(AfterSort + "  ");
		}
	}

}
