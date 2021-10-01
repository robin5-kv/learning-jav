
public class test7 {
	/*
	 * String Buffer is als child class of Charsequence. It is mutable ie the value
	 * of the string can be changed
	 * 
	 * string cannot be reversed
	 * 
	 */
	public static void main(String[] args) {
		String name = "robin";
		System.out.println("string is immutable ");
		System.out.println("Appeneding name " + name.concat("vincent"));
		System.out.println("after appending original nameis no changed" + name);
		StringBuffer sb = new StringBuffer();
		System.out.println("Appeneding name " + sb.append("vincent"));

		System.out.println("aAfter Appending name" + sb);

	}

}
