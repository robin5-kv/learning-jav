package basicsjavaprograms;

public class Swap {

	public void withVar() {

		int a = 10;
		int b = 20;
		int temp = 0;
		System.out.println("before swapping value of A  " + a + "and  B are " + b);
		temp = a;
		a = b;
		b = temp;
		System.out.println("After swapping value of A  " + a + "and B are" + b);

	}

	public void withouvar() {
		int a = 202;
		int b = 102;
		System.out.println("before swapping value of A  " + a + "and  B are " + b);
		a = a - b;

		b = a + b;
		a = b - a;
		
		System.out.println("before swapping value of A  " + a + "and  B are " + b);
	}

	public static void main(String[] args) {
		Swap s = new Swap();
		//s.withVar();
		s.withouvar();
	}

}
