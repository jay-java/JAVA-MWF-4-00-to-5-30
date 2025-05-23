package core;

public class P007_Pattern {
	public static void main(String[] args) {
//		***
//		***
//		***

//		*
//		**
//		***
//		****
//		*****

		for (int r = 1; r <= 5; r++) {
			for (int c = 1; c <= r; c++) {
				System.out.print("*");
			}
			System.out.println();
		}

//		1
//		12
//		123
//		1234
//		12345

		for (int r = 1; r <= 5; r++) {
			for (int c = 1; c <= r; c++) {
				System.out.print(c);
			}
			System.out.println();
		}

//		1
//		23
//		456
//		78910
		int a = 1;
		for (int r = 1; r <= 5; r++) {
			for (int s = 4; s >= r; s--) {
				System.out.print(" ");
			}
			for (int c = 1; c <= r; c++) {
				System.out.print(a + " ");
				a++;
			}
			System.out.println();
		}

//		  1
//		 23
//		 456
//		78910

//		1
//		01
//		101
//		0101
//		10101

		for (int r = 1; r <= 5; r++) {
			for (int s = 1; s < r; s++) {
				System.out.print(" ");
			}
			for (int c = 5; c >= r; c--) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}
}
