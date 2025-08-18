package day8;

import java.util.Arrays;

public class A2_Split2 {

	public static void main(String[] args) {
		String a = "$10,20,30";

		String sp = a.replace("$", "").replace(",", "");
		System.out.println("After Replaceing ; " + sp);

//		for (int i = 0; i < sp2.length; i++) {
//			System.out.println(sp2[i]);
//		}

		String gmail = "hanamant@gmail,com";
		String s1[] = gmail.split("@");
		System.out.println(Arrays.toString(s1));

		String s2[] = s1[1].split(",");
		System.out.println(Arrays.toString(s2));
	}

}
