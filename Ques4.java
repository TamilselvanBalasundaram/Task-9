package task9;

import java.util.Scanner;

public class Ques4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the Number : " );
		Scanner pattern = new Scanner(System.in);
		int input = pattern.nextInt();
		
		int i,j;
		for (i = 0 ; i < input ; i++) {
			for(j = 0 ; j < input ; j++) {
				if (i == j || i + j == input - 1)
				System.out.print("*");
				else {
					System.out.print(" ");	
				}
			}
			System.out.println();
	
		}

	}

}
