import java.util.TreeSet;

public class test12 {
	
	/**
	 * TreeSet is the implementation class of SortedSet Interface.
	 * Does not allow duplicates.
	 * Sorts the elements
	 * It has 6 methods like first,last,headSet,tailSet,subSet and comparator.
	 * Difference between Hashset and Treeset, hash doesnt maintain order
	 * but Treeset maintains ascending or alphabetical order.
	 * DS-> Balanced Tree
	 * Heterogeneous data not allowed. If added Exception, ClassCast will occur
	 * For default natural sorting order,the objects should be homogeneous and comparable else class cast exception
	 * To say any class is comporable or not, the class should implement comparable interface.
	 */
	public void newname() {
		

	TreeSet<Integer> tt =new TreeSet<Integer>();
	tt.add(1);
	tt.add(90);
	tt.add(123);
	tt.add(234);
	
	//tt.add(null);// if we add null in the tree set it is allowed till 1.6 but now null is not allowed 
	System.out.println(tt);
	tt.pollFirst();
	System.out.println("after poolinf firest elememt:"+tt);
	}
		
	public static void main(String[] args) {
		test12 t12 =new test12();
		t12.newname();
		
		
		
	}

}
