package ConstructorConcept;

public class Conconcept {
	
	public Conconcept() {
		System.out.println("default const");
	}
	
	public Conconcept(int i) {
		System.out.println("single param");
		System.out.println("the value of i " +i);


	}
	
	public Conconcept(int i, int j) {
		System.out.println("double param");
		System.out.println("the value of i " +i);
		System.out.println("the value of j " +j);


	}
	public static void main(String[] args) {
		
	}

}
