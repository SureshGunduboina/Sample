package org;
interface I{
	int i =10;
	void m1();
	void m2();
	
	
}
class C implements I{
	public void m1() {
		System.out.println("m1");
	}
	public void m2() {
		System.out.println("m2");
	}
	
}
public class Interface {

	public static void main(String[] args) {
		
	C c= new C();
	c.m1();
	c.m2();
	System.out.println(I.i);
	System.out.println(c.i);


}
}
