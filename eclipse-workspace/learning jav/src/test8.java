/*
 * Exception handling        
 */
public class test8 {

	public static void main(String[] args) {
		try {
			int i = 12;
			int n = 0;
			System.out.println(i / n);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} finally {
			System.out.println("code is Success");
			System.out.println("verified");
		}

	}

}
