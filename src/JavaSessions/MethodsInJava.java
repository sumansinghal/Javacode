package JavaSessions;

public class MethodsInJava {
// logic is in block
	//you can call this block
	//static / non static method
	// cannot create method inside another method
	//but call method from diff method
	//duplicate method not allowed
	//we can overload method
	//main is  a method
	//method should be independant
	//to call non static method- we have to create object 
	//function cannot return multiple values
	// can return only one value at time
	
	
	
	public static void main(String[] args) {
		MethodsInJava obj= new MethodsInJava();
		obj.test();
		int c= obj.sum();
		System.out.println(c);
		String s=obj.getTrainerName();
		System.out.println(s);
		String s1=obj.getTrainerName();
		int s2=obj.add(30, 30);
		System.out.println(s2);
		//if(s1.equals("Suman"){
				
			
		}
		

//1. no input no return
	
	//void in nature// not return anything
	public void test() {
		System.out.println("test method");
		
	}
	
	//2. no input but some return
	//return integer
	public int sum() {
		
		System.out.println("sum method");
		int a=10;
		int b=20;
		int z=a+b;
		return z;
	}
	
	public String getTrainerName() {
		System.out.println("get trainer name");
		String name ="Suman";
		return name;
		
		
	}
	//3. some input some return
	public int add(int a, int b) {
		System.out.println("add method");
		int sum = a+b;
		return sum;
		
	}
	
}
