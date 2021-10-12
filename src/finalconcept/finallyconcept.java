package finalconcept;

public class finallyconcept {

	public static void main(String[] args) {
		test1();
		
	}
	
	public static void test1() {
		try {
			System.out.println("inside test 1 method");
			throw new Exception("test");
					
		}catch (Exception e) {
			System.out.println("inside catch block ");
		}
		
		finally
		{
			System.out.println("finally block");
		}
	}

}
