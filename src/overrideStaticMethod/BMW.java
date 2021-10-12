package overrideStaticMethod;

public class BMW extends Car {
	
	@Override
	//static method cannot be overridden
	public static void start() {
		System.out.println("BMW--start");
	}
	
	

}
