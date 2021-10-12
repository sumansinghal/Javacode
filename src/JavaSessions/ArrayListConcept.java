package JavaSessions;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayListConcept {

	public static void main(String[] args) {
		
		//ArrayList<String> ar= new ArrayList<String>();
	   // ArrayList<String> studentNames= new ArrayList<String>();	
		ArrayList ar= new ArrayList();
		
 
 //ar.add(200);
	
 //ar.add(300);
 //ar.add(400);
 //for(int i=0;i<ar.size();i++) {
 //System.out.println(ar.size());
 //System.out.println(ar.get(i));
 
 //getting specific index from array list
 
 //an element into the array list at the first and last positions
 //ar.add(0, "black");
 //ar.add(ar.size(), "pink");
 //ar.add("Pink");
 //Updating specific element
 //ar.set(0, "Magenta");
 //ar.set(1, "blue");
 //System.out.println(ar.size());
 
 //Reverse the array list
 studentNames.add("Varun");
 studentNames.add("Angel");
 studentNames.add("Sid");
 //Collections.reverse(studentNames);
 for(int i=studentNames.size()-1;i>=0;i--) {
	 //System.out.println(studentNames.get(i));// 
	 Collections.reverse(studentNames);
	 //System.out.println(studentNames);
	}
 //Collections.reverse(studentNames);
 System.out.println(studentNames);
	}

}
