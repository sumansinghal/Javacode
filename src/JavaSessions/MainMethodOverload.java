package JavaSessions;

public class MainMethodOverload {

	
	
	///Static method can be overload
	//multiple main method it executes main method with string parameters
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("my main method");

	}
	public static void main(int a) {
		// TODO Auto-generated method stub
		System.out.println("my main method" +a);

	}
	public static void main(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("my main method" +a+b);
	}
}
