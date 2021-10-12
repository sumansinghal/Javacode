package OOP_Inheritance;
// this class cannot be parent if final is keyword
//final class cannot be inherited
public class Car extends Vehicle {
	
	static int speed=100;
	
	
	//parent cannot take anything from child
	//3 methods
	//method cannot be overridden if final keyword is mentioned
	public void start() {
		System.out.println("Car---start");
	}
	
	public void stop() {
		System.out.println("Car---stop");

	}
	public void refuel() {
		System.out.println("Car---refuel");

	}
	//can be overload static - yes
	//static method cannot be overridden
	public static void getName() {
		System.out.println("Car get name");
	}

}
