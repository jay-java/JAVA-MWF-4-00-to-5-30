package core;

import java.util.Scanner;

public class P022_Matrix {
	public static void main(String[] args) {

		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

		Scanner sc = new Scanner(System.in);
		System.out.println("enter row = ");
		int row = sc.nextInt();

		System.out.println("enter col = ");
		int col = sc.nextInt();

		int ar1[][] = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print("enter ar[" + i + "][" + j + "] : ");
				ar1[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(ar1[i][j] + " ");
			}
			System.out.println();
		}

		int ar2[][] = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print("enter ar[" + i + "][" + j + "] : ");
				ar2[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(ar2[i][j] + " ");
			}
			System.out.println();
		}

		// multiplication
		int ar3[][] = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				ar3[i][j] = ar1[i][j] * ar2[i][j];
			}
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(ar3[i][j] + " ");
			}
			System.out.println();
		}

	}
}
