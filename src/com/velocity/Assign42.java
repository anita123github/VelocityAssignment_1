
//*write the java pgm to design method for substraction of two number
// *which returns int results to that method and result should be
// *print into main method.  


package com.velocity;

public class Assign42 {
	public int getSub(int a,int b) {
		int sub=a-b;
		return sub;
	}

	public static void main(String[] args) {
		Assign42 assign=new Assign42();
		int result=assign.getSub(5,3);
		
		System.out.println("Substraction of two number=>"+result);
	}

}