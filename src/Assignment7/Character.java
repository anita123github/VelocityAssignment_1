//Design method to check whether the character is alphabet,digit and special symbol

package Assignment7;

import java.util.Scanner;

public class Character {

	public static void main(String[]args) {
		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any choice");
		ch=sc.next().charAt(0);
		if((ch>='a'&& ch<='z')||(ch>='A'&&ch<='Z')) {
			System.out.println(ch  +  "  is a Alphabet");
		}
		else if(ch>='0'&&ch<='9')	{
			System.out.println(ch  +  "  is a Digit");
		}
		else {
			System.out.println(ch  +  "  is a Special symbols");
		}
			sc.close();
		}
	}


