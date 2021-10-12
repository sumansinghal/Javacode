package OOP_Encapsulation;

public class TestEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Emp obj = new Emp();
		Emp e2 = new Emp();
		Emp e3 = new Emp();
		
		
		obj.setName("Rohan");
		obj.setAge(26);
		obj.setSalary(26000);
		obj.setGender("M");
		obj.setActive(false);
		e2.setName("Raj");
		e2.setAge(27);
		e2.setSalary(36000);
		e2.setGender("M");
		e2.setActive(true);
		e3.setName("Rustom");
		e3.setAge(28);
		e3.setSalary(45000);
		e3.setGender("M");
		e3.setActive(false);
		
		System.out.println(obj.getName());
		System.out.println(obj.getAge());
		System.out.println(obj.getSalary());
		System.out.println(obj.getGender());
		System.out.println(obj.isActive());
		
		System.out.println(e2.getName());
		System.out.println(e2.getAge());
		System.out.println(e2.getSalary());
		System.out.println(e2.getGender());
		System.out.println(e2.isActive());
		
		System.out.println(e3.getName());
		System.out.println(e3.getAge());
		System.out.println(e3.getSalary());
		System.out.println(e3.getGender());
		System.out.println(e3.isActive());
		String info = obj.getEmpInfo();
		System.out.println(info);
		String info1= e2.getEmpInfo();
		System.out.println(info1);
		String info2= e3.getEmpInfo();
		System.out.println(info2);
		

	}

}
