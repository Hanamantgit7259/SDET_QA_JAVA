package day9;

public class B2_Immutable {

	public static void main(String[] args) {

		String a = "Welcome";
		System.out.println(a);  //Welcome
		String value = a.concat("To Java");
		System.out.println(a);  //Welcome ===>Immutable-here it is not displaying the concatenated value
		System.out.println(value);  //Welcome To java
	}

}
