package OOP_Interface;

public class WrapperClassConcept {

	public static void main(String[] args) {
		String x="100";
		System.out.println(x+20);
		//conversion from string to int
		int i = Integer.parseInt(x);
		System.out.println(i);
		
		//conversion from string to double
		String y= "12.33";
		double d =Double.parseDouble(y);
		System.out.println(d+10);
		
		//int to string
		int j = 200;
		String s=String.valueOf(j);
		System.out.println(s+20);
		
		
	}

}
