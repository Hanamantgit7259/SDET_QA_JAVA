package day12;

public class B1_Encapsulation {
	
	private int srNo;
	private String name;
	private String dept;
	public int getSrNo() {
		return srNo;
	}
	public void setSrNo(int srNo) {
		this.srNo = srNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public void details() {
		System.out.println(" Sr No : " + srNo);
		System.out.println(" Name  : " + name);
		System.out.println(" Dept  : " + dept);
	}
	
	

}
