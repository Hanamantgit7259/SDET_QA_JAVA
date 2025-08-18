package day11;

public class B1_DataAssigningToVariables {

	static int srNo;
	String name;
	int age;
	double salary;

	void method(String nm, int ag, double sal) {
		srNo++;
		name = nm;
		age = ag;
		salary = sal;

	}

	void printDetails() {

		System.out.println("Serial Number : " + srNo);
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("salary : " + salary);
	}

	  B1_DataAssigningToVariables(String nm, int ag, double sal) {
		srNo++;
		this.name = nm;
		this.age = ag;
		this.salary = sal;
	}
}
