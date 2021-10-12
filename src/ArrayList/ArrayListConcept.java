package ArrayList;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		//dynamic array
		// contains duplicate values
		//maintains insertion order
		// it is not synchronized---- not thread safe
		//allows random access to fetch any element beacuse it stotes values on basis of indexes
		
		ArrayList ar = new ArrayList();
		ar.add(10);//0
		ar.add(20);//1
		ar.add(30);//3
		System.out.println(ar.size());
		
		ar.add(40);
		ar.add(50);
		ar.add("test");
		ar.add(true);
		
		System.out.println(ar.size());
		
		System.out.println(ar.get(0));//retreiving value
		
		//to print all values from arraylist-- we use for loop or iterator
		
		for(int i = 0; i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		//Non generic vs generics
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(1);
		
		
		
	}

}
