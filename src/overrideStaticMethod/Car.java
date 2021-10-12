package overrideStaticMethod;

public class Car {

	//This is poymorphism - same method in parent and class
	
	//Method Hiding
	public static void start() {
		
		System.out.println("Car---Start");
	}
	
	public void stop() {

		System.out.println("Car----Stop");
	}
	
	public void fuel() {
		
		System.out.println("Car---fuel");
	}
	

}
