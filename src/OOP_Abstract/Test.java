package OOP_Abstract;

public class Test extends Shape{

	Test(){
		System.out.println("Test class const");
	}
	public static void main(String[] args) {
		
		Shape s=new Test();
		s.drawing();
		s.fill();
		
		Test test = new Test();
		
		
		

	}

	@Override
	void drawing() {
		System.out.println("Test---drawing");
	}

}
