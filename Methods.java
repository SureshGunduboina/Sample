package org;
class Employees{
	private int eno;
	private String ename;
	private float esal;
	private String eaddr;
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public float getEsal() {
		return esal;
	}
	public void setEsal(float esal) {
		this.esal = esal;
	}
	public String getEaddr() {
		return eaddr;
	}
	public void setEaddr(String eaddr) {
		this.eaddr = eaddr;
	}
	
	
}
public class Methods {

	public static void main(String[] args)throws Exception {
	Employees e = new Employees();
	e.setEno(111);
	e.setEname("aaa");
	e.setEsal(1000f);
	e.setEaddr("hyd");
	
	System.out.println(e.getEno());
	System.out.println(e.getEname());
	
	System.out.println(e.getEsal());
	System.out.println(e.getEaddr());
	}
}
