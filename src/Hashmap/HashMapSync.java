package Hashmap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapSync {

	public static void main(String[] args) {
		//synchronised map in collection class
		Map<String, String> map1= new HashMap<String, String>();
		map1.put("1", "Naveen");
		map1.put("2", "Tom");
		map1.put("3", "Cros");
		
		//create sync map- throw sync modifcation exception
		Map<String, String> map2= Collections.synchronizedMap(map1);
		System.out.println(map2);
		
		//concurrent hashmap- it doesnt thorw concurrent hashmap modification exception
		ConcurrentHashMap<String,String> concurrentmap = new ConcurrentHashMap<String,String>();
		concurrentmap.put("A", "Java");
		concurrentmap.put("B", "Ruby");
		concurrentmap.put("C", "Python");
		
		System.out.println(concurrentmap.get("A"));
	}

}
