/*WAP Leap Year or Not Leap year */

package com.velocity;

public class assi52 {

	public static void main(String[] args) {
		int year=2012;
		if((year%4==0 && year%100==0)||(year%4==0 && year%100!=0)) {
			System.out.println("This is a leap year");
		}
		else {
			System.out.println("THis is not Leap Year");
		}
		
	}

}