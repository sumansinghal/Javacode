package JavaSessions;

public class Car {
	
	String name;
	int price;
	String color;
	static int wheels=4;//Common property value

	public static void main(String[] args) {
		
		//Object will never hold any static property
		//static vars should be accessed by class name
		Car c1= new Car();
		c1.name="BMW";
		c1.price=70;
		c1.color="Whilte";
		//c1.wheels=4;
		
		Car c2 = new Car();
		c2.name = "AUDI";
		c2.price = 80;
		//c2.color = "Red";

		Car c3 = new Car();
		c3.name = "Honda";
		c3.price = 20;
		c3.color = "Black";
        //c3.wheels=4;
		
		System.out.println(c1.name + " "+c1.price +" "+c1.color +" "+Car.wheels);
		System.out.println(c1.wheels);//wrong practice
		
		
	}

}
