package ConstructorConcept;

import java.util.ArrayList;
import java.util.List;

public class University {
	// cons doesnt return anything
	//same name as class name
	//not a function
	//but func may or may not return
	//cons can be overloaded
	//cons will be called when you create the obj of the class
	
	private String name;//global var- remain same everywhere
	private String HQ;
	private ArrayList<String> courseList;
	

	public University(String name, String hQ, ArrayList<String>courseList) {
		
		this.name = name;// this.class var= local var
		this.HQ = hQ;
		this.courseList = courseList;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getHQ() {
		return HQ;
	}


	public void setHQ(String hQ) {
		HQ = hQ;
	}


	public ArrayList<String> getCourseList() {
		return courseList;
	}


	public void setCourseList(ArrayList<String> courseList) {
		this.courseList = courseList;
	}
	



	
	

}
