package core;

import java.util.Scanner;

class ABC{
	public void call() {
		System.out.println("call in abc class");
	}
}
public class P004_UserInput {
	public static void main(String[] args) {
		System.out.println("main method start");
		ABC a = new ABC();
		a.call();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a = ");
		int i= sc.nextInt();
		System.out.println("i = "+i);
		
		System.out.println("double d = ");
		double d = sc.nextDouble();
		System.out.println("d = "+d);
	}
}
