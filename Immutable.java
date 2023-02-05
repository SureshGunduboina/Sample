package org;
class Calcultor{
	private final int count;
	private int i;
	private int j;
	public Calcultor(int count) {
		this.count = count;
	}
	public Calcultor increment() {
		Calcultor cal = new Calcultor(this.count+1);
		return cal;
	}
	public Calcultor decreament() {
		Calcultor cal = new Calcultor(this.count -1);
		return cal;
	}
	public int getcount() {
		return this.count;
	}
	public Calcultor(int i, int j){
		this.count = 0;
		this.j=j;
		this.i = i;
		System.out.println(i+""+j);
	}
}

public class Immutable {

	public static void main(String[] args) {
		Calcultor cal1 = new Calcultor(10);
		System.out.println(cal1.getcount());
		Calcultor cal2 = cal1.increment();
		System.out.println(cal2.getcount());
		Calcultor cal3 = cal1.decreament();
		System.out.println(cal3.getcount());
		Calcultor calc = new Calcultor(10,20);

	}

}
