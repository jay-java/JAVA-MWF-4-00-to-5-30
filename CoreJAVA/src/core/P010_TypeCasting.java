package core;

public class P010_TypeCasting {
	public static void main(String[] args) {
		int i = (int)1.456;
		System.out.println(i);

		double d = i;
		System.out.println(d);

		String s = "1";
		//wrapper class
		int a = Integer.parseInt(s);
		System.out.println(a);
		
		double d1 = Double.parseDouble(s);
		System.out.println(d1);
		
		int b = 12;
		String n = String.valueOf(b);
		System.out.println(n);
	}
}
