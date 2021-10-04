
public class test5C implements test5I
{

	
	

	@Override
	public void test123() {
		System.out.println("all is well");
		
	}

	@Override
	public int test1231() {
	System.out.println(1);
		return 1;
		
		
	}

	public static void main(String[] args)
	{
		test5I tc =new test5C();
		tc.test123();
		tc.test1231();
		/*test5I tc =new test5I();
	tc.amount*/
		//test5C tc1 =new test5C();
		
		 System.out.println(test5C.uplimit);
		
	}
}
