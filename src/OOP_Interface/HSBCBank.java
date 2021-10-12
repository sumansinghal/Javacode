package OOP_Interface;

public class HSBCBank implements USBank, BrazilBank {//we are achieving multiple inheritance
//also called as a relationship- interface to class
	//has a relationship- class to class 
	//business logic is defined in corresponding child class
	@Override
	public void credit() {
		System.out.println("HSBC---credit");
	}

	@Override
	public void debit() {
		System.out.println("HSBC---debit");

	}

	@Override
	public void transferMoney() {
		System.out.println("HSBC---transferMoney");

	}
	
	public void educationLoan() {
		System.out.println("HSBC---educationLoan");
	}
    public void carLoan() {
    	System.out.println("HSBC----carLoan");
    }

	@Override
	public void mutualFund() {
    	System.out.println("HSBC----mutualFund");

	}
    
}
