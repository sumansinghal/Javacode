package OOP_Abstract;

public class ICICIBank implements USBank,RBI{

	@Override
	public void educationLoan() {
		System.out.println("ICICI---educationLoan");
	}

	@Override
	public void hoamLoan() {
		System.out.println("ICICI---hoamLoan");

	}

	@Override
	public void carLoan() {
		System.out.println("ICICI---carLoan");

	}

	@Override
	public void debit() {
		System.out.println("ICICI---debit");

	}

	@Override
	public void credit() {
		System.out.println("ICICI---credit");

	}

	@Override
	public void transferMoney() {
		System.out.println("ICICI---transferMoney");

	}

	@Override
	public void trading() {
		System.out.println("ICICI---trading");
		
	}
	public void mutualFunds() {
		System.out.println("ICICI---mutualFunds");
	}
	public void insurance() {
		System.out.println("ICICI---insurance");
	}
	
	//interface is 100 percent abstraction

}
