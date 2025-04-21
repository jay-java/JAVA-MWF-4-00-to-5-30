package core;

//single
class A {
	A(){
		System.out.println("a cons");
	}
	public void classA() {
		System.out.println("A class");
	}
}

class B extends A {
	public void classB() {
		System.out.println("B class");
	}
}

//multilevel
class C extends B {
	public void classC() {
		System.out.println("C class");
	}
}

//hierarchical
class D extends A {
	public void classD() {
		System.out.println("D class");
	}
}

//multiple inheritance is not supported by JAVA -> it creates ambiguity(confusion)

public class P012_Inheritance {
	public static void main(String[] args) {
		B b = new B();
		b.classA();
		b.classB();

		C c = new C();
		c.classA();
		c.classB();
		c.classC();

		D d = new D();
		d.classA();
		d.classD();

	}
}
