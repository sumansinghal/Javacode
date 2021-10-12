package OOP_Encapsulation;

public class Emp {
	
	private String name;
	private int age;
	private double salary;
	private boolean isActive;
	private String gender;
	
	
	public String getEmpInfo() {
		String info = name + age + salary + isActive + gender;	
		return info;
	}
	
	
	public String getName() {
		return name;
	}
	
	// setter and getter methods are public in nature
	//This keyword can be accessed with class variable not local var
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	





}
