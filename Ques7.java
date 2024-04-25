package task9;

import java.util.Scanner;

public class Ques7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the numbers : ");
		Scanner input = new Scanner(System.in);
		int A = input.nextInt();
		int B = input.nextInt();
		int C = input.nextInt();
		if(A >= B && A>= C) {
			System.out.println(A + " is greater");
		}
		else if(B >= A && B>= C) {
			System.out.println(B + " is greater");
		}
		else if(C >= B && C >= A) {
			System.out.println(C + " is greater");
		}
	}

}
