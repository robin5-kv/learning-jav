package basicsjavaprograms;

import java.util.Scanner;

public class Printnumber {

	public static void main(String[] args) {

		System.out.println("enter a  number");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
	int	num=1000;
		while (i <= num) 
		{
			System.out.println(i);
			i++;
		}

	}

}
