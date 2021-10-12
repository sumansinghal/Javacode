package OOP_Abstract;

public abstract class Shape {
	
	Shape(){
		System.out.println("Shape class const");
	}
	
	
	//cannot create obj of abstract class
	int color;
	abstract void drawing();
	public void fill() {
	System.out.println("Shape---fill");
	}
}
