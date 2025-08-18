package day8;

public class B2_RemoveSpecialCharacters {

	public static void main(String[] args) {

		String s = "B%@an_g*#$alore";
		System.out.println(s.replaceAll("[^a-zA-Z0-9]", "")); // removes all special characters
		System.out.println(s.replaceAll("[a-zA-Z0-9]", "")); // remove all characters and keeps only special characters
		System.out.println(s.replaceAll("^[a-zA-Z0-9]", "")); // removes only first alphanumeric character if present

	}

}
