package day9;

public class B41_StringOccurances {

	public static void main(String[] args) {

		String a = "Bangalore";
		int occ = 0;

		for (int i = 0; i < a.length(); i++) {

			for (int j = 0; j < a.length(); j++) {

				if (a.charAt(i) == a.charAt(j)) {
					++occ;

				}
			}

			// System.out.println("The String : " + a.charAt(i) + " Repeated " + occ + "
			// Times ");
			// occ=0;

			if (occ > 0) {

				System.out.println("The String : " + a.charAt(i) + " Repeated " + occ + " Times ");
				a.replace(String.valueOf(a.charAt(i)), "");
				occ = 0;
			} else {
				System.out.println("The String : " + a.charAt(i) + " Repeated " + occ + " Times ");
				occ = 0;
			}
		}
		System.out.println(a);

	}

}
