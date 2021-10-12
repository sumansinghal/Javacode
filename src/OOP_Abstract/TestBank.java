package OOP_Abstract;

public class TestBank {

	public static void main(String[] args) {
		
		//ICICIBank ic= new ICICIBank();
		//ic.carLoan();
		
		HDFCBank hd= new HDFCBank();
		hd.credit();
		hd.debit();
		hd.loan();
		
		

	}

}
