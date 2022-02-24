package basicsjavaprograms;

import java.io.InputStream;
import java.util.Scanner;

public class Loopingnumbers {

	public static void main(String[] args) {
		int num = 0;
		System.out.println("enter a number");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		for(int row=1;row<=num;row++)
		{
		
			for(int col =1;col<row;col++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int row =1;row<=num; row++) 
		{
			for(int col =5;col>=row;col--) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
	
	}

}
