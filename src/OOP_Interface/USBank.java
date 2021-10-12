package OOP_Interface;

public interface USBank {
	
	//if a class is implemeting any interface, this is mandatory to define/ override all the methods of interface
	//interface will define only final and static var
	final int wheels = 4;
	
	int min_bal=100;
	public void credit();
	public void debit();
	public void transferMoney();	

	//interface- only method declaration
	// interface we can declare var , vars are by default static 
	//var values will not be changed- its final in nature
	// no static method in interface
	// no main method
	//abstract in nature - we cannot create obj of interface
	
}
