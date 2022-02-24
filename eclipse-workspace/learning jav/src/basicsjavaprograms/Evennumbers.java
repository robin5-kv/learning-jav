package basicsjavaprograms;

import java.util.Scanner;

public class Evennumbers {

	public static void main(String[] args) {
		System.out.println("Enter a number");

		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		if (value % 2 ==0) {
			System.out.println("the given number "  +value+ " is even");
		}
		
		else
			System.out.println("odd");
	}
}