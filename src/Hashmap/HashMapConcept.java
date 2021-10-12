package Hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import ArrayList.Employee;

public class HashMapConcept {
	
//	public static Map<String, Integer>marksMap;
	// hasmap is a class impements map interface
	//extends abstract map
	//it contains unique element
	//stores the values - key-value pair
	//it may have one null key and multiple null values
	//it maintains no order
	
	
//	static {
//		marksMap = new HashMap<>();
//		marksMap.put("A", 100);
//		marksMap.put("B", 200);
//	}

	public static void main(String[] args) {
 
		//1. using hashMap class
		
//		HashMap<String, String> map1= new HashMap<String, String>();
//		Map<String, String> map2= new HashMap<>();
		HashMap<Integer, String> hs= new HashMap<Integer, String>();
		hs.put(1, "selenium");
		hs.put(2, "QTP");
		hs.put(3, "Testcomplate");
		System.out.println(hs.get(1));//fectch the value
		
		for(Entry m: hs.entrySet()) {
			System.out.println(m.getKey()+ "" +m.getValue());
			
		}
		hs.remove(3);// it doesnt maintain the order
		
		HashMap<Integer, Employee> emp = new HashMap<Integer, Employee>();
		Employee e1= new Employee("Tom", 25, "admin");
		Employee e2= new Employee("Peter", 26, "QA");
		Employee e3= new Employee("Steve", 27, "Dev");
		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);
		
		
		// traverse the hashmap
		//hashmap is nonsynchronoized-- used in multithread hashmap object can be accessed by all threads
		//concurrent modification exception---when callin hashmap and in between any modifcation happenning fail fast condition
		for(Entry<Integer, Employee> m: emp.entrySet()) {
			int key = m.getKey();
			Employee e= m.getValue();
			System.out.println(key+"Info");
			System.out.println(e.getName() + " " +e.age + "" +e.dept);
			
			
		}
		
		
		//2. using static way
//		System.out.println(HashMapConcept.marksMap.get("A"));
		
		//3.Imutable map
		
	}

}
