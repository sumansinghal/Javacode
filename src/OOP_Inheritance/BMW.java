package OOP_Inheritance;
//BMW is child of car
public class BMW extends Car {
	//Mehod overriding: polymorphism ()
	// Method overriding- method in parent class same method in child class with:
	//1.same name
	//2. same parameters
	//3. same return type
	
	//int speed = 200;
	@Override
	public void start() {
		System.out.println("BMW---start");
	}
	//@Override
	public void autoParking() {
		System.out.println("BMW---autoparking");
	}
	//Method hiding
	public static void getName() {
		System.out.println("BMW get name");
	}
	
	

}
