package ConstructorConcept;

public class B extends A {
	
	public B() {
		super(10);
		System.out.println("child class");
	}
	
	public static void main (String arg[]) {
		
		B obj = new B();
		
		
	}

}
