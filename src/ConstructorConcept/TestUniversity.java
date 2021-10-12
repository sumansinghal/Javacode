package ConstructorConcept;

import java.util.ArrayList;

public class TestUniversity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> delhiUniCourseList = new ArrayList<String>();
		delhiUniCourseList.add("Physics");
		delhiUniCourseList.add("Chem");
		delhiUniCourseList.add("Math");
		University u1  = new University("DelhiUni", "Mumbai", delhiUniCourseList);
			System.out.println(u1.getName());
			System.out.println(u1.getHQ());
			System.out.println(u1.getCourseList());
			u1.setHQ("Pune");
			System.out.println(u1.getName()+"" +u1.getHQ());
			
		
	}

}
