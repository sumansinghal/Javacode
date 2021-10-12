package OOP_Interface;

public class TestBank {

	public static void main(String[] args) {

		HSBCBank hs = new HSBCBank();
		System.out.println(USBank.min_bal);	
		
		hs.credit();
		hs.debit();
		hs.transferMoney();
		hs.educationLoan();
		hs.carLoan();
		hs.mutualFund();
		
		//dynamic polymorphism- child class obj can be referred by parent interface ref var
		//top casting
		USBank b=new HSBCBank();
		b.credit();
		b.debit();
		b.transferMoney();
		
	
	}

}
