package day9;

public class B4_StringOccurances {

	public static void main(String[] args) {
		String a = "Www";

		int num = 0;
		for (int i = 0; i < a.length(); i++) {

			for (int j = 0; j < a.length(); j++) {

				if (a.charAt(i) == a.charAt(j)) {
					++num;
				}
			}
			if (num > 0) {
				System.out.println("The Character " + a.charAt(i) + " Repeated " + num + " Times ");
				num = 0;
			} else {
				num = 0;
			}
		}
	}

}
