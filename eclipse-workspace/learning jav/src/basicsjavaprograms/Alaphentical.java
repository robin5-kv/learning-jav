package basicsjavaprograms;

public class Alaphentical {

	public static void main(String[] args) {
		int value = 64;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print((char) (value + j) + " ");
			}
			System.out.println();
		}
		char a = 'A';
		int n = a;
		System.out.println("the " + n + "value of Ais ");

	}

}
