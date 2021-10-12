package JavaSessions;

public class Employee {
	//class template- create object
	//class var: will be common for all objects , but values will be different
	//Global variable
	String name;
	int age;
	double salary;
	boolean isActive;

	public static void main(String[] args) {
		//create object
		String name="peter";//local variable
		System.out.println(name);
		Employee e1=new Employee();
		
		e1.name="Tom";
		e1.age =20;
		e1.salary=20.9;
		e1.isActive=false;
		System.out.println(e1.name);//---> null
		System.out.println(e1.age);//0
		System.out.println(e1.salary);//0.0
		System.out.println(e1.isActive);//false
		
		
		
		
		
		
		

	}

}
