
public class Learning2 {

	 int x;
	public  void collectdetails  (int x, double y)
	{
		//this.x=x;
		System.out.println(x+y);
			
	}
	
	private void collectdetails (int x, int y, int z) 
	{
	//return (x+y+z);	
	  System.out.println(x*y+z);   
	}
	
	public static void main(String[] args) {
		Learning2 l2 = new Learning2();
		l2.collectdetails(12, 12.3);
		//l2.collectdetails(12, 123, 12);//
           l2.collectdetails(12, 12, 12);
	}

}
