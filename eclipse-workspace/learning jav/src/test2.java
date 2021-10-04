
public class test2 {
	
	 int a;
	 float b;
	 double c;
	 char d;
	 String e;
	 
	void value(int a, float b,double c, char d, String e) 
	{
		this.a =a;
		this.b=b;
		this.c=c;
		this.d=d;
		this.e=e;	
/* Below print statment is added in same method for this we have to do 	specfiy the parameter in method it self
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);*/
	}
	public void display() {

		//Below print statement is done by creating the method by using this keyword//
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);	
	}
	public static void main(String[] args) 
	{
		test2 t2 =new test2();
		t2.display();
		
		
		// Below print statment is done by creating the variables as static//
		 /*System.out.println(c);
		 System.out.println(d);
		 System.out.println(b);
		 System.out.println(a);
		 System.out.println(e);*/
	}

}
