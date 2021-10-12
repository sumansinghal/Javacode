package OOP_Static;

public class StaticVSNonStatic {
	
	//global vars- the scope of global vars are available across all the fun with some conditions
	String name = "Tom";
	static int age = 25;
	
	public static void main(String[] args) {
		
		//how to call static methods and vars
		//1. direct calling
		
		sum();
		
		System.out.println(StaticVSNonStatic.age);
		//2. calling by classname
		System.out.println(age);
		
		
		//how to call non static methid and vars
		StaticVSNonStatic obj = new StaticVSNonStatic();
		System.out.println(obj.name);
		obj.sendMail();
		//can i access static method by using obj references ?yes
		obj.sum();// warning will be given
		
		
		
		
		

	}
	
	public void sendMail() {
		System.out.println("send mail method");
	}
	
	public static void sum() {
		System.out.println("sum method");
	}
}	
