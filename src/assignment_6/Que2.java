/*Design method void multiplication (int no)and print 
 * the multiplicationt table(Example enter the no=5 then output
 * like    5*1=5..........5*10=50)
  
 */
package assignment_6;

public class Que2 {
	public void mul() {
		int num=5;
				for(int i=1;i<=10;i++) {
					//int c=num*i;
			System.out.println("5*"+i+":"+num*i);
		//System.out.println(c);
		//System.out.println(num*i);
		}
	}

	public static void main(String[] args) {
		Que2 que=new Que2();
		que.mul();
	}

}
