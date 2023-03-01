//Design method public int getNumberCube(int num),return int value to that
//method and result should be into main method.

package Assignment7;

import java.util.Scanner;

public class Cube {
	
	public int getNumberCube(int num) {
		int a=num*num*num;
		return a;
	}

	public static void main(String[] args) {
		System.out.println(" Enter the number");
        Scanner scanner=new Scanner(System.in);
		int number=scanner.nextInt();
		Cube cube=new Cube();
	    int result=cube.getNumberCube(number);
		System.out.println("Cube of number" + result);
      	scanner.close();
	}

}
