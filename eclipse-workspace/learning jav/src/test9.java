import java.util.ArrayList;
import java.util.Iterator;

public class test9 {

	/*
	 * ArrayList<String> al =new ArrayList<String>();
	 */

	ArrayList<String> al = new ArrayList<String>();

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("Ron");
		al.add("Robin");
		al.add("Vibin");
		System.out.println(al);
		// al.clear();
		System.out.println(al.get(1));
		for (String string : al) {
			System.out.println("Executed through for each loop"+string);

		}
		System.out.println("-------------------------------");
		try {

			Iterator<String> all = al.iterator();
			while (all.hasNext()) {
				String string = (String) all.next();
				System.out.println(string);

			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("-----------------------");
			try {
				for (int i = 0; i < al.size(); i++) {
					System.out.println(i);
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

		al.set(1, null);
		System.out.println(al);
		
		
	}

}
