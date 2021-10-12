package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class TestEmployee {

	public static void main(String[] args) {
		// create Employee object
		Employee e1= new Employee("Tom", 27, "CS");
		Employee e2= new Employee("Sam", 27, "ES");
		Employee e3= new Employee("Mark", 27, "PT");
		
		//create array list
		
		ArrayList<Employee> ar = new ArrayList<Employee>();
		ar.add(e1);// thi is used as employee object
		ar.add(e2);
		ar.add(e3);
		
		//iterator to traverse values- to use all the values of e1, e2, e3
		// iterator doesnt work on the basis of indexes so cannot use for loop
		Iterator<Employee> it = ar.iterator();
		while(it.hasNext()) {
			Employee emp= it.next();// returns e1 object first
			System.out.println(emp.getName());
			System.out.println(emp.age);
			System.out.println(emp.dept);
			
			
		}
		
		//AddAll- 
		ArrayList<String> ar1= new ArrayList<String>();
		ar1.add("test");
		ar1.add("Master");
		ar1.add("Peter");
		
		ArrayList<String> ar2= new ArrayList<String>();
		ar2.add("dev");
		ar2.add("Java");
		ar2.add("Python");
		
		ar1.addAll(ar2);
		for(int i=0;i<ar1.size();i++) {
			System.out.println(ar1.get(i));
		}
		
		//removeall
		ar1.removeAll(ar2);
		for(int i=0;i<ar1.size();i++) {
			System.out.println(ar1.get(i));
		}
		//retain all
		
		
		
		
		
		
		
	}

}
