package day9;

public class C1_RemoveJunksInString {

	public static void main(String[] args) {
		String a = "B!s@d#k$h%j&7*)*%*&79&";

		String replace1 = a.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(replace1);

		String replace2 = a.replaceAll("^[a-zA-Z0-9]", "");
		System.out.println(replace2);

		String num = "ABC123CDEF143";
		String numReplace = num.replaceAll("[0-9]", "");
		System.out.println(numReplace);

	}

}
