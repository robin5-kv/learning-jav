package basicsjavaprograms;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {

		int number = 0;
		int reverse = 0;
		System.out.println("enter a number");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		while (number != 0) {
			reverse = reverse * 10;
			reverse = reverse + number % 10;
			number = number / 10;
		}
		System.out.println(reverse);
	}

}
