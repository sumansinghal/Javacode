package ArrayList;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListMethod {

	public static void main(String[] args) {

		// LinkedList is a default class in Java
		  // it can be used as List, Stack, Queue
		  // it allows the null entry
		  // dynamic collection
		  // hence insertion and deletion can be easily implemented
		  // it can contain duplicate elements
		  // it is not synchronized(not thread safe)
		  // in LL, manipulation is fast because we dont need any shifting.

		  // LinkedList constructors:

		  // LinkedList();
		  // LinkedList(Collection c);
		
		LinkedList<String> names = new LinkedList<String>();
		System.out.println(names.size());
		
		names.add("Tom");
		names.add("Naveen");
		names.add("Robby");
		names.add("Lisa");
		
		System.out.println(names.size());
		System.out.println(names);
		System.out.println(names.get(0));
		
		Iterator<String> it = names.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
		
		names.add(4, "Steve");
		System.out.println(names);
		names.add(2, "Ram");
		System.out.println(names);
		
		LinkedList<String> users = new LinkedList<String>();
		users.add("peter");
		users.add("Trump");
		names.addAll(users);
		System.out.println(names);
		names.addFirst("kamla");
		System.out.println(names);
		
		names.addLast("Fire");
		System.out.println(names);
		
		names.remove(2);
		System.out.println(names);
		
		LinkedList<String> lang = new LinkedList<String>();
		System.out.println(lang.size());
		
		lang.add("JAVA");
		lang.add("Python");
		lang.add("Rubby");
		lang.add("JS");
		
		System.out.println(lang.size());
		//reverse the linkedlist
		
		Iterator<String> itr = lang.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		for(String e:lang) {
			System.out.println(e);
		}
		
		//sort
		Collections.sort(lang);
		System.out.println(lang);
		
		//How to print all values using for loop
//		for(int n=0;n<ll.size;n++) {
//			System.out.println(ll.get(n));
		
		
	
	//using advance for loop
//	for(String str: ll) {
//		System.out.println(str);
	}
	

}
