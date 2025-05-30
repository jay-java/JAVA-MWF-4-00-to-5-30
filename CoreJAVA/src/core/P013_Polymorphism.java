package core;

class Overload {
	public int add(int a, int b) {
		System.out.println("add parent");
		return a+b;
	}

	public int add(int a,int b ,int c) {
		return a+b+c;
	}
	public void call() {
		System.out.println("call in overlaod/parent");
	}
}

class Override extends Overload{
	public int add(int a, int b) {
		super.add(12, 13);
		System.out.println("add child");
		return a+b;
	}
	public void call() {
		System.out.println("call in override/child");
	}
}

public class P013_Polymorphism {
	public static void main(String[] args) {
//		Overload o = new Overload();
//		int res1 = o.add(1,2);
//		int res2 = o.add(1, 2, 3);
		
		Override o1 = new Override();
		int r = o1.add(1, 2);
		System.out.println("r = "+r);
		o1.call();
	}
}
