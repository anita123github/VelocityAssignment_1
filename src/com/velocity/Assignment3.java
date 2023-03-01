//design the separate method as String getStudentName(String name)
//which returns student name and print it.
package com.velocity;

public class Assignment3 {
	public String getStudentName(String name){
		return name;
		
	}

	public static void main(String[] args) {
		Assignment3 assign=new Assignment3();
		String name=assign.getStudentName("Anita");
		System.out.println("Enter the student name::"+name);
	}

}
