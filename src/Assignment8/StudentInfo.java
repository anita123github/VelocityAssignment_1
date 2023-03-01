package Assignment8;

import java.util.Scanner;

public class StudentInfo {
	int rollNo;
    String firstName;
    String lastName;
    static String country="India";
    static int i=1;
    public void getUserInput() {
    	System.out.println("\nEnter data for "+  i  + "  object");
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter Student Roll Number::\n");
    	rollNo=sc.nextInt();
    	System.out.println("Enter Student First Name::\n");
    	firstName=sc.next();
    	System.out.println("Enter Student last Name::\n");
    	lastName=sc.next();
    	//System.out.println("Enter Student country::");
    	//country=sc.next();
    	i++;
    	
      }
    public void display() {
    	System.out.println(rollNo+"\t"+firstName+"\t"+lastName+"\t"+country);
      }

	public static void main(String[] args) {
       StudentInfo stud1=new StudentInfo();
       StudentInfo stud2=new StudentInfo();
       stud1.getUserInput();
       stud2.getUserInput();
       System.out.println("RollNo\tFirstName\tLastName\tCountry");
       System.out.println("***********************************************");
       stud1.display();
       stud2.display();
       
	}

}
