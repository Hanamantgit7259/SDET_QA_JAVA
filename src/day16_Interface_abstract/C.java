package day16_Interface_abstract;

public abstract class C implements B {

	int ab=10;
	int cd=20;
	@Override
	public abstract void m1();

	@Override
	public void m2() {
		System.out.println("Implimented m2 in abstract class");

	}

	@Override
	public void m4() {

		System.out.println("Implimented m4 in abstract class");
	}

}
