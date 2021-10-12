package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteration {

	public static void main(String[] args) {
		
		ArrayList<String> tvSeries = new ArrayList<String>();
		tvSeries.add("A");
		tvSeries.add("B");
		
		// 1. using java 8 with for each loop and lambda expression
		
		tvSeries.forEach(shows->{
			
			System.out.println(shows);
		});
		
		System.out.println("print using iterator");
		
		//2. using iterator
		Iterator<String> it = tvSeries.iterator();
		while(it.hasNext()){
			String shows1 = it.next();
			System.out.println(shows1);
			
		}
		
		//3. using iterator and java 8 for each remaining method
		System.out.println("print using iterator and java 8 for each remaining method");
		
		 it = tvSeries.iterator();
		 it.forEachRemaining(shows->{
			 System.out.println(shows);
			 
		 });
		 
		 //4. using for each loop
	System.out.println("print using for each loop");

		 for(String shows:tvSeries) {
			 System.out.println(shows);
		 }

		//5. using for loop with order/index
	System.out.println("print using for loop");

		 for(int i=0; i<tvSeries.size();i++) {
			 System.out.println(tvSeries.get(i));
		 }

	}
	
		

}
