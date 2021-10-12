package JavaSessions;

public class TestCustomer {

	public static void main(String[] args) {
		Customer c1=new Customer();
		c1.name="Tom";
		c1.emailID="tom@gmail.com";
		c1.phone = 9898989;
		c1.isPrime= true;
		
		System.out.println(c1.name);
		System.out.println(Customer.category);
		
		
		

	}

}
