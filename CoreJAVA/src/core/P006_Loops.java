package core;

public class P006_Loops {
	public static void main(String[] args) {
		//1.for(initialization;condition;increment/decrement){body}
		for(int i=1;i<=5;i++) {
			System.out.println(i);
		}
		for(int i =5;i>=1;i--) {
			System.out.println(i);
		}
		
		//2.while(condition){body}
		
		int j =1;
		while(j<=5) {
			System.out.println(j);
			j++;
		}
		
		int k=5;
		while(k>=1) {
			System.out.println(k);
			k--;
		}
		
		//3.do while
		int a=1;
		do {
			System.out.println(a);
			a++;
		}
		while(a<=5);
		
		
		
	}
}
