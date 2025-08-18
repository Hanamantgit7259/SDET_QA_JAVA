package day16_Interface_abstract;

public interface A {

	int a=10;
	int b=20;
	
	public abstract void m1();
	public void m2();
	public static void m3() {
		System.out.println("static Method in interface A");
	}
	
}
