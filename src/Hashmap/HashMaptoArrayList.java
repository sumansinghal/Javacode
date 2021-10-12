package Hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import java.util.Map;

public class HashMaptoArrayList {

	public static void main(String[] args) {

		HashMap<String, Integer>compMap= new HashMap<String, Integer>();
		compMap.put("Google", 10000);
		compMap.put("Walmart", 20000);
		compMap.put("Amazon", 30000);
		compMap.put("Facebook", 5000);
		compMap.put("Cisco", 15000);
		
		System.out.println(compMap.size());
		Iterator it =compMap.entrySet().iterator();
		
		while(it.hasNext()) {
			
		Map.Entry pairs = (Map.Entry)it.next();
		System.out.println(pairs.getKey()+" = "+pairs.getValue());
			
			
		}
		
		//convert hashmap to array list
		ArrayList<String> compNamesList = new ArrayList<String>(compMap.keySet());
		for (String t:compNamesList ) {
			System.out.println(t);
		}
		ArrayList<Integer>EmpValueList= new ArrayList<Integer>(compMap.values());
		
		for (Integer e:EmpValueList) {
			System.out.println(e);
		}
		
		
		
		
		
		
	}

}
