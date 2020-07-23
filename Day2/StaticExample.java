public class StaticExample{
	
	static int x = 10;
	static int y;
	
	static {
		System.out.println("Static block initialized");
		y = x + 40;
	}
	
	static void method1(){
		System.out.println("inside static method");
	}
	
	public static void main(String[] args) 
	{
		method1();
		System.out.println("Value of x : "+x); 
	    System.out.println("Value of y : "+y); 
	}
	
}