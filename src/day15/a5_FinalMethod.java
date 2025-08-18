package day15;

public class a5_FinalMethod {

	
	final void method() {
		System.out.println("i am a final method from parent class : ");
	}
}

class child extends a5_FinalMethod{
	
	//Cannot be override the final method
/*	void method() {
		
	}
*/	
}

