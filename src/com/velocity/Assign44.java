/*write the java pgm to design method for division of two number
 *which returns int results to that method and result should be
 *print into main method.  
 */


package com.velocity;

public class Assign44 {
	public double getDiv(int a,int b) {
		double div=a/b;
		return div;
	}
	public static void main(String[] args) {
	   Assign44 assign=new Assign44();
	   double result=assign.getDiv(20,2);
	   System.out.println("Division of two number=>"+result);

	}
}
