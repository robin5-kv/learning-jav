package basicsjavaprograms;

public class Reverse {
	String s = "Robin";

	public void buffer() {

		StringBuffer sb = new StringBuffer(s);
		System.out.println(sb.reverse());
	}

	public void Own() {
		String name = "";
		String reverse = "";
		name = "selenium";
		char[] character = name.toCharArray();
		
		 for (int i = name.length() - 1; i >= 0; i--) { 
			 reverse = reverse +character[i];
		  } 
		 System.out.println(reverse);
		 
	}

	public void Array() {
		String name = "";
		String reverse = "";
		name = "selenium";
		char[] character = name.toCharArray();

	}

	public static void main(String[] args) {
		Reverse rr = new Reverse();
		rr.Own();
	}

}
