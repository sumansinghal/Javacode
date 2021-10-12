package ListConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> ll= new LinkedList<String>();
		ll.add("Test");
		ll.add("QTP");
		ll.add("Selenium");
		ll.add("RPA");
		ll.add("RFT");
		System.out.println("context if linkedlist:" +ll);
		
		ll.addFirst("Suman");
		ll.addLast("Automation");
		
		//get
		System.out.println(ll.get(0));;
		
		//set
		ll.set(0, "Tom");
		System.out.println(ll.get(0));
		
		//remove
		ll.removeFirst();
		ll.removeLast();
		
		//how to print all values of linkedlist:
		//for loop
		//advance loop
		//iterator
		//while loop
		
		
		System.out.println("using for loop");
		for (int n=0; n<ll.size(); n++) {
			System.out.println(ll.get(n));
		}
		
		System.out.println("using advance for loop");
		
		for(String str: ll) {
			System.out.println(str);
		}
		
		System.out.println("iterator");
		
		Iterator<String> it = ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
		
		//while loop
		
		int num = 0;
		while(ll.size()>num) {
			System.out.println(ll.get(num));
			num = num+1;
		}
		
	}

}
