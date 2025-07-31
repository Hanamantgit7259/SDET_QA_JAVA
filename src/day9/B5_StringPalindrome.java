package day9;

public class B5_StringPalindrome {

	public static void main(String[] args) {
		String a = "AMA";
		// int num=0;
		String rev = "";

		for (int i = a.length() - 1; i >= 0; i--) {

			rev = rev + a.charAt(i);
		}

		if (a.equals(rev)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
	}

}
