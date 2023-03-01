package Assignment7;

import java.util.Scanner;

public class Factor {
	public int fact1(int no) {
		//System.out.print("Factors of  " + no +"  are  ");
		for(int i=1;i<=no;i++) {
			if(no % i== 0) {
				System.out.print(i+ " ");
			}
	
	}
		return no;
	
	}
		public static void main(String[] args) {
			int no;
			System.out.println("Enter the Factor number\n");
		Scanner scanner= new Scanner(System.in);
		int num=scanner.nextInt();	
		System.out.println("This number of result are");
		Factor factor=new Factor();
		int result=factor.fact1(num);
		scanner.close();
	}
}
