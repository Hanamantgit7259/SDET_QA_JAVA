package day2_day3;

public class p3_LargeNumber_Ternary_Operator {

	public static void main(String[] args) {

		int a = 10, b = 20;

		boolean cond = a > b && b > a;
	//	System.out.println(cond);

		String large = cond ? "a is greater:" + a : "b is greater:" + b;
		System.out.println(large);
	}

}
