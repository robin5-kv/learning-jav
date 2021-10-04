import java.util.HashSet;

public class test10 {

	public void ex() {
		HashSet<String> hs = new HashSet<String>();
		hs.add("Robin");
		hs.add("George");
		hs.add(null);
		System.out.println(hs);
		HashSet<String> hs1 = new HashSet<String>();
		
	System.out.println(hs.addAll(hs1));	
	
	}
	
	public void exx() {
		HashSet hss =new HashSet();
		hss.add(1);
		System.out.println(hss);
		//hss.addAll(null);
		System.out.println(hss);
		
	}
	public static void main(String[] args) {

		test10 t10 = new test10();
		t10.ex();
      //t10.exx();
	}

}
