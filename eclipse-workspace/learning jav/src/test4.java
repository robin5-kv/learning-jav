
public class test4 {

	// static String fruits [] = {"Apple","Banana","Grapes","jack"};

	public static void main(String[] args) {
		String Fruits[] = { "Apple", "Banana", "Grapes", "jack" };
		int[] a = new int[5];
		a[0] = 1233;
		a[1] = 1234;
		a[2] = 1235;
		a[3] = 1236;
		a[4] = 12331;
//String [][] a= new String[2][2]
		for (String b : Fruits) {
			System.out.println(b);
		}

		for (int b : a) {
			System.out.println(b);
		}
	}

}
