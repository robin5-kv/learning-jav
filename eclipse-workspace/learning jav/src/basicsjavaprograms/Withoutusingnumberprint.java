package basicsjavaprograms;

public class Withoutusingnumberprint {

	public static void printnumm(int value)
	{
	
		if (value >= 0) 
		{

		System.out.println(value);
		value--;
		printnumm(value);
		}
	}

	public static void main(String[] args) {
		/*
		 * int one ='A'/'A'; //1 String s="**********"; for (int
		 * i=one;i<=(s.length())*(s.length());i++) System.out.println(i);
		 */
		printnumm(100);

	}

}
