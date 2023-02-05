package org;
abstract class A{
	abstract void m1();
	abstract void m2();
	
	
}
class B extends A{
	void m1() {
		System.out.println("m1");
	}
	void m2() {
		System.out.println("m2");
	}
	
}
public class Abstract {

	public static void main(String[] args) {
		A a =new B();
		a.m1();
		a.m2();
	B b= new B();
	b.m1();
	b.m2();

}
}
