package ArrayList;

public class Employee {
	
	private String name;
	public int age;
	public String dept;
	
	public Employee(String name, int age, String dept){
		this.setName(name);
		this.age=age;
		this.dept=dept;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
