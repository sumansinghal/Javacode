package OOP_Abstract;

public abstract class Bank {
	
	//hiding implementation logic and partiall abstraction
	//no method body
	//cannot create object of abstract clas
	
	//Bank is parent and HDFC is child all implementation logic will b defined in child class
	public abstract void loan();
	
	public void credit() {
		System.out.println("Bank---credit");
	}
	public void debit() {
		System.out.println("Bank---debit");
	}
	

}
