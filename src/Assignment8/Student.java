package Assignment8;

import java.util.Scanner;

public class Student {
int rollNo;  
String studName;
String country;

 public Student(String studName,int rollNo,String country) {
	  this.studName=studName;
	  this.rollNo=rollNo;
	  this.country=country;	  
  }
 
  public void getUserInput() {
	   // Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the student Name>>"+studName);
	  //studName=sc.nextLine();
	  System.out.println("Enter the student RollNo>>"+rollNo);
	 // rollNo=sc.nextInt();
	   System.out.println("Enter the student country>>"+country);
	 // country=sc.nextLine();
	 // sc.close();
	   
  }
	
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the student Name>>");
		 String stud2=sc.nextLine();
		 System.out.println("Enter the student RollNo>>");
		 int stud1=sc.nextInt();	
		 System.out.println("Enter the student country>>");
		 String stud3=sc.next();	
		 System.out.println(stud2);
		 System.out.println(stud1);
		 System.out.println(stud3);
		Student stud= new Student(stud2,stud1,stud3);
		stud.getUserInput();
		sc.close();
	
	}

}
