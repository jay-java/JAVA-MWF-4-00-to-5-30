package core;

import java.util.Scanner;

public class P008_Array {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (int index = 0; index < a.length; index++) {
			System.out.println(a[index]);
		}

		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		for (int index = 0; index < arr.length; index++) {
			System.out.print("enter element at a[" + index + "] : ");
			arr[index] = sc.nextInt();
		}
		int sum = 0;
		for (int index = 0; index < arr.length; index++) {
			sum = sum + arr[index];
		}

		System.out.println("sum = " + sum);

		System.out.println("enter number : ");
		int num = sc.nextInt();

		int counter = 0;
		for (int index = 0; index < arr.length; index++) {
			if (num == arr[index]) {
				counter++;
			} else {
			}
		}
		if (counter > 0) {
			System.out.println("yes exist " + counter + " times");
		} else {
			System.out.println("not exist");
		}

	}
}
