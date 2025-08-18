package day10;

public class A3_MethodParaMeterReturnvalue {

	// No Para-No Return type
	void m1() {
		System.out.println("No Para No Return type");
	}

	// No para but Return type
	String m2() {
		System.out.println("No Para but return value ");
		return ("I am No Para but return value");

	}

	// Takes Para but No return type

	void m3(String val) {
		System.out.println(" Takes Para but No return type ");

		if (val.contains("Sending value m3")) {
			System.out.println("Recived value m3");
		} else {
			System.out.println("No Value : ");
		}

	}

	//both Yes
	int m4(int a,int b) {
		System.out.println("Takes para & Returns value ");
		return a+b;
	}
		
}
