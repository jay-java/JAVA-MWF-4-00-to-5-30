package core;

public class P003_Operators {
	public static void main(String[] args) {
		// 1.Assignment -> =,+=,-=,*=,/=
		int i = 123;

		i += 13; // i =i+13
		System.out.println(i);
		i -= 12;
		System.out.println(i);
		i *= 2;
		System.out.println(i);
		i /= 2;
		System.out.println(i);

		// 2.Arithmetic -> +,-,*,/,%
		System.out.println(10 + 2);
		System.out.println(10 - 2);
		System.out.println(10 * 2);
		System.out.println(10 / 2);
		System.out.println(10 % 2);

		// 3.Conditional- >,<,>=,<=,==,!=
		System.out.println(10 > 2);
		System.out.println(10 < 2);
		System.out.println(10 >= 10);
		System.out.println(10 <= 2);
		System.out.println(10 == 2);
		System.out.println(10 != 2);

		// 4.Unary -> ++,--
		int a = 1;
		a++;// post increment/ a = a+1 ->2
		++a;// pre-increment a = a+1 ->3
		System.out.println(a); //->3

		int b = ++a;
		System.out.println("b = "+ b);
		
		a--;
		System.out.println(a);
		
		//5. logical -> &&,||,!
 		

	}
}
