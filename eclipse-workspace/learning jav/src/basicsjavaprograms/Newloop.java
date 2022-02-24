package basicsjavaprograms;

import java.util.Scanner;

public class Newloop {

	public static void main(String[] args) {

		int num = 0;
		// System.out.println("enter a number");
		// Scanner sc = new Scanner(System.in);
		// num = sc.nextInt();
		for (int row = 0; row < 5; row++) {
			for (int spaces = 4; spaces > row; spaces--) {
				System.out.print(" ");
			}

			for (int col = 0; col <= row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
