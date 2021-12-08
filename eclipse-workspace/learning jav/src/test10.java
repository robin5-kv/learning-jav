import java.util.HashSet;

public class test10 {  
	/*Set(I) -> SortedSet(Child Interface)->NavigableSet(I)=> TreeSet(C) is the implementation 
	 *Important points to remember:
	 *1. To store group of individual objects.
	 *2. Duplicates not allowed
	 *3.Insertion order will not be maintained
	 *4.Set(I) doesn't have any new methods other than given in Collection(I).
	 *5. DS for HashSet is Hash table
	 *6. If we add duplicate value to HashSet, simply it will return false to the
	 *add() and it won't throw any error or exception.
	 *7. We can insert null values
	 *8. Heterogeneous values can be added.
	 *9. Implements Serializable and Cloneable?-> Yes
	 *10. Data are stored based on hashcode, so search is very effective.
	 *11. Fill Ratio or Load factor:0.75 or 75%
	 *12.Default capacity-16
	 */

	/*
	 * Number Constructors available in HashSet=4
	 * 1. HashSet hs= new HashSet();// size-16 and fill ratio is 0.75
	 * 2. HashSet hs= new HashSet(int initialSize);size as declared and fill ratio is 0.75(default)
	 * 3. HashSet hs= new HashSet(int initialSize, float fillRatio);//size and fill ratio can be declared
	 * 4. HashSet hs= new HashSet(Collection c);// creates a HashSet for any given Collection (Acts as interconversion)
	 */





	public void ex() {
		HashSet<String> hs = new HashSet<String>();
		hs.add("Robin");
		hs.add("George");
		hs.add(null);
		hs.add("Robin");//Null values are not allowed.
		System.out.println(hs);
		HashSet<String> hs1 = new HashSet<String>();
		
	System.out.println(hs.addAll(hs));	
	
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
