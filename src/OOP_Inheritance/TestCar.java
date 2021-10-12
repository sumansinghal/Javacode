package OOP_Inheritance;
//preference will be given to child class
public class TestCar {

	public static void main(String[] args) {

		
		BMW b = new BMW();
		b.stop();//inherited
		b.refuel();//inherited
		b.start();//overriden
		b.autoParking();//individual
		b.engine();
		
		
		BMW.getName();
		
		System.out.println(Car.speed);
		System.out.println();
		
		Car c= new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		//child without reference can be reffered by parent class ref var
		//top casting
		//child class can be referred by parent class ref var
		//ref type check
		Car c1 = new BMW();
		
		c1.stop();
		c1.refuel();
		c1.start();//child class is peferred
		c1
		
		//child class can be referred by grand parent class ref variable
		Vehicle v1= new BMW();
		v1.engine();
		
		
		//downcasting- parent class can be reffered by child class
		//BMW b1= (BMW)new Car();
		
		BMW b2 = (BMW)new Vehicle();//complie time no error but run time clas cast error
	Audi a= new Audi();
	a.start();
	a.stop();
	a.refuel();
	a.childLock();//individual method
	//Siblings cannot inherit
	
	BMW b3 =new Audi();
	}
	

}
