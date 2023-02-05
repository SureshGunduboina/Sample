package org;
class D{
	public String s(){
		return "String"; 
	}
}
public class HashCode {

	public static void main(String[] args) {
	D a = new D();
	System.out.println(a.hashCode());
	System.out.println(a.toString());
	D b = new D();
	System.out.println(b.hashCode());
	System.out.println(b.toString());
	System.out.println(a.s());
	Exception e =new Exception("edc");
	System.out.println(e);
	}

}
