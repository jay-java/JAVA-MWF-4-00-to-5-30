package core;
final class A1{
	final int i =1;
	final public void change() {
//		i++;
		System.out.println("change in parent");
	}
}
class B1 extends A1{
	public void change() {
		System.out.println("change in parent");
	}
}
public class P017_Final {
	public static void main(String[] args) {
		A1 a = new A1();
		a.change();
	}
}
