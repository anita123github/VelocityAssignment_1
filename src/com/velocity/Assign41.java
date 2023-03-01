
/*write the java pgm to design method for addition of two number
 *which returns int results to that method and result should be
 *print into main method.  
 */

package com.velocity;

public class Assign41 {
	public int getSum(int a,int b) {
		int sum=a+b;
		return sum;
	}
	

	public static void main(String[] args) {
		Assign41 assign=new Assign41();
		int result=assign.getSum(2,3);
		System.out.println("Addition of two number=>"+result);

	}

}
