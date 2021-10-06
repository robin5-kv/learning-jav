import java.util.HashMap;

public class test13 {

	
	public void  tnt() {
		/*Map (I) is not a child class of collection interface hence it is considered as true
		 * It will not allow duplicate keys
		 *It is defined by keys and values 
		 *Values can be duplicated
		 * 
		 * 
		 * 
		 */
		HashMap<Integer, String> hs =new HashMap<Integer, String>();
		hs.put(1, "robin");
		hs.put(2, "Vibiin");
		hs.put(3, "pappa");
		
		
		hs.put(4, "Mummy");
		hs.put(6, "ather");
		System.out.println(hs);//printing the data by adding and key and value 
		HashMap<Integer, String> hss =new HashMap<Integer, String>();
		
		System.out.println(hs.clone());//clone the exsisting data complettely
		System.out.println(hs.containsKey(1));//Returns boolean if key is present
		System.out.println(hs.get(2));//reterive data
		System.out.println(hs.keySet());//returns key value 
		System.out.println(hs.values());
		System.out.println(hs.remove(1, "robin"));
		System.out.println("After removed the data"+hs);
		System.out.println(hs.replace(2, "null"));
		System.out.println("After changed the data"+hs);
		
		
	}
	public static void main(String[] args) {
		test13 t13=new test13();
		t13.tnt();
		
		String s ="Mummy";
		System.out.println(s.hashCode());
		
	}

}
