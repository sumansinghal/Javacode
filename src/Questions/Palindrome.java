package Questions;

public class Palindrome {
	
	
	
	public static void isPalindromeNumber(int num) {
		int r=0;
		int sum=0;
		int t;
		t=num;
		
		while(num>0) {
			r=num%10;//get reminder
			sum= (sum*10)+r;
			num=num/10;
			
		}
		
		if(t==sum) {
			System.out.println("palindrome number");
		}
			else {
				System.out.println("not palindrome");
			}
			
			
			
			
		}
		
		

		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isPalindromeNumber(151);

	}

}
