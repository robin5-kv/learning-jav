
public class test6 {

	/*
	 * String is immutable i.e once the string is declared it cannot be chnaged.
	 * String implements the charsequence. it can be declared in two ways one way is
	 * 1. String literal 2.String New string literal Mostly prefer string new
	 * declaration type' It is stored heap memory.
	 */

	static String s2 = "Vibin";

	public static void main(String[] args) {
		int num = 12;
		String s = "Robin";

		System.out.println(s.isEmpty());// checks if the string is empty
		System.out.println(s.concat("Vincent"));

	System.out.println(s2);
	//It will return each byte of the String
		byte[] b = s2.getBytes();
		for (byte c : b) {
			System.out.println(c);
		}

		int r = s2.compareTo(s);
		System.out.println(r);
		System.out.println(s.valueOf(num));// convert the given data to string.

	}

}
