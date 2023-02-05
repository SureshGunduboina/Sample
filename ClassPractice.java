package org;
class Employee{
	String eid = "E-111";
	String ename = "AAA";
	float esal = 50000.0f;
	String eaddr = "Hyd";
	String eemail = "aaa.@gmail.com";
	String emobile = "97876543210";
	
	public void getEmpDetails() {
		System.out.println("Employee Details");
		System.out.println("-------------------");
		System.out.println("Emp Id      :"+eid);
		System.out.println("Emp Name    :"+ename);
		System.out.println("Emp Salary  :"+esal);
		System.out.println("Emp Address  :"+eaddr);
		System.out.println("Emp Email   :"+eemail);
		System.out.println("Emp Mobile  :"+emobile);
		
		
	}
}
public class ClassPractice {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.getEmpDetails();
	}

}
