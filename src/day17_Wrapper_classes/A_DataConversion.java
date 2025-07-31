package day17_Wrapper_classes;

public class A_DataConversion {

	public static void main(String[] args) {

		// Sc1" String---int, double, float, boolean,char
		String s1 = "150";
		String s2 = "150";

		int a1 = Integer.parseInt(s1);
		int a2 = Integer.parseInt(s2);

		System.out.println(s1 + s2);
		System.out.println(a1 + a2);

		// String to Double
		double d1 = Double.parseDouble(s1);
		double d2 = Double.parseDouble(s2);
		System.out.println(d1 + d2);

		// String to Boolean

		String data = "Welcome";

		String data2 = data.replaceAll(data, "true");
		boolean res1 = Boolean.parseBoolean(data);
		boolean res2 = Boolean.parseBoolean(data2);

		System.out.println(res1);// Default results when we have anything other than True in String
		System.out.println(res2);

		// Scenario 2
		// int double, char, Boolean ====>> String

		int a = 10;
		double b = 20.5;
		char c = 'A';
		boolean bb = false;

		String intvalue = String.valueOf(a);
		String doubleValue = String.valueOf(b);
		String charValue = String.valueOf(c);
		String boolVlue = String.valueOf(bb);
		
		System.out.println(intvalue);
		System.out.println(doubleValue);
		System.out.println(charValue);
		System.out.println(boolVlue);

	}

}
