package day14;

public class A3_Single_Child extends A2_SingIe_Parent {

	String relation;

	String childName;
	int cage;

	public A3_Single_Child(String prelation, String parentName, int page, String relation, String childName, int cage) {

		super(prelation, parentName, page);
		this.relation = relation;
		this.childName = childName;
		this.cage = cage;

	}

	public void childMethod() {
		System.out.println("Child Method");
		System.out.println("Relation : " + relation);
		System.out.println("Child Name : " + childName);
		System.out.println(" Child Age : " + cage);

	}
}
