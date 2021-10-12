package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// dynamic array- can store duplicate values
		//2. maintain insertion
		//3. synchronized
		// allows random access to fetch any element because it stores values on the basis of index
		
		
		ArrayList ar = new ArrayList();
		ar.add(10);
		ar.add(20);
		ar.add(30);
		
		System.out.println(ar.size());
		System.out.println(ar.get(2));
		
		// to print all the values from array list we have to use for loop
		// for loop
		// iterator
		
		for (int i=0; i <ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		Employee e1= new Employee("Tom", 25, "CD");
		Employee e2= new Employee("Neeraj", 45, "ET");
		Employee e3= new Employee("Fat", 45, "OR");
		
		ArrayList<Employee> ar1= new ArrayList<Employee>();
		ar1.add(e1);
		ar1.add(e2);
		ar1.add(e3);
		
		//when not sure what kind of generics shoudl be passed then "e" shoudl be used
		Iterator<Employee> it = ar.iterator<Employee>();
		while (it.hasNext()) {
			Employee emp = it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		
			
			
			
		}
		
		
		
	}

}
