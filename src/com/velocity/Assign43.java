
/*write the java pgm to design method for multiplication of two number
 *which returns int results to that method and result should be
 *print into main method.  
 */


package com.velocity;

public class Assign43 {
	//use non static method
	
    public int myMul(int a,int b)
    {
    	int mul=a*b;
    	return mul;
    
    }

	public static void main(String[] args) {
		Assign43 assig=new Assign43();
		int result=assig.myMul(10,5);
		System.out.println("Display the value of Multiplication::"+result);
		

	}

}