//created class with both overloaded constructor and the instance variable using.
public class test3 {
	int a;
	 float b;
	 double c;
	 char d;
	 String e;
	 
public  test3 (int x, float y, double z, char xx,String xy ) {
		this.a=x;
		this.b=y;
		this.c=z;
		this.d=xx;
		this.e=xy;	
		
}

public  test3 (int x, float y) {
	this.a=x;
	this.b=y;
}
	void display() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);	
	}
	void ds2 () {
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) {
		test3 t3= new test3(12, 12, 12.12, 'a', "Robinn");
		t3.display();	
		test3 ConsOV =new test3(12, 122);
		ConsOV.ds2();
	}

}
