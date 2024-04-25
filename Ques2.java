package task9;

import java.util.Scanner;

public class Ques2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i;
		String B = "";
		System.out.println("Enter the Word");
		Scanner input = new Scanner(System.in);
		String A = input.next();
		for (i=A.length()-1 ; i>=0 ;i--) {
			B = B + A.charAt(i);
		}
		System.out.println("The reverse order of the given word is " + B);
	
		}

}
