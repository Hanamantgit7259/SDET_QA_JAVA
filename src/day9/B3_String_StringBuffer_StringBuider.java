package day9;

public class B3_String_StringBuffer_StringBuider {

	public static void main(String[] args) {
		// String-Immutable
		String s = "Welcome";
		String value = s.concat("to Java");
		System.out.println(s); // immutable
		System.out.println(value);

		System.out.println("------------------------------------");
		// StringBuffer--Mutable
		StringBuffer sf = new StringBuffer("Welcome");
		StringBuffer sfValue = sf.append("To Java");
		System.out.println(sf);       // Welcome to Java
		System.out.println(sfValue); // Welcome to Java
		
		System.out.println("------------------------------------");
		// StringBuilder--Mutable
		StringBuffer sb = new StringBuffer("Welcome");
		StringBuffer sbValue = sb.append("To Java");
		System.out.println(sb);       // Welcome to Java
		System.out.println(sbValue); // Welcome to Java
		
	}

}
