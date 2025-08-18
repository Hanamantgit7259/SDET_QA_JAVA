package day9;

public class B8_StringCount {

	public static void main(String[] args) {
		String a = "Bangalore is a good city";
		int count = 0;
		String removed = "";
		String finalValue = "";
		String nonRepeated = "";
		String repeated = "";

		for (int i = 0; i < a.length(); i++) {

			for (int j = 0; j < a.length(); j++) {

				if (a.charAt(i) == a.charAt(j)) {

					count++;

				}
			}
			if (count > 0) {

				System.out.println("The Letter " + a.charAt(i) + " Repeated " + count + " Times ");
				// removed=a.replaceAll(String.valueOf(a.charAt(i)), "");
				repeated = repeated + a.charAt(i);
				count = 0;

			}

			else {
				nonRepeated = nonRepeated + a.charAt(i);
				count = 0;
			}
		}

	//	System.out.println("Removed the Repeated letters : " + removed);
		System.out.println(" Non Repeated letters : " + nonRepeated);
		System.out.println(" Repeated letters : " + repeated);
	}

}
