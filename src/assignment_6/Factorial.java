package assignment_6;

public class Factorial {
	int number;
	public int factOrial(int no) {
		int a=1;
		//int number=no;
		for(int i=no;i>=1;i--) {
			 a=a*i;
		
					}
	
		return a;
		}
		
	public static void main(String[] args) {
		Factorial factorial=new Factorial();
		int sum=factorial.factOrial(5);
		System.out.println("Factorial of five No is :"+sum);
	}

}
