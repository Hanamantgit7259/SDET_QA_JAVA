package day14;

public class A2_SingIe_Parent {

	String prelation;
	String parentName;
	int page;
	
	
	
	public A2_SingIe_Parent(String relation, String parentName, int page) {
		this.prelation = relation;
		this.parentName = parentName;
		this.page = page;
	}



	public void parentMethod() {
		System.out.println("parent Method");
		System.out.println("Relation : " + prelation);
		System.out.println("Parent Name : " + parentName);
		System.out.println("Fathers Age : " + page);
	}
	
	
}
