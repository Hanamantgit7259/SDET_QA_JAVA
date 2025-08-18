package day16_Interface_abstract;

public interface B extends A {

	int c = 30;
	int d = 40;

	public void m4();

	default void m5() {
		System.out.println("Default Method in Interface B ");
	}

}
