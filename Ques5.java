package task9;

import java.util.Scanner;

public class Ques5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner Result = new Scanner(System.in);
		System.out.println("Enter the Marks : ");
		int marks = Result.nextInt();
		
		System.out.println();
		if (marks == 100) {
			System.out.println("The Grade is S");
		}else if (marks >= 90 && marks <= 99) {
			System.out.println("The Grade is A");
		}else if (marks >= 80 && marks <= 89) {
			System.out.println("The Grade is B");
		}else if (marks >= 70 && marks <= 79) {
			System.out.println("The Grade is C");
		}else if (marks >= 60 && marks <= 69) {
			System.out.println("The Grade is D");
		}else if (marks >= 50 && marks <= 59) {
			System.out.println("The Grade is E");
		}else if (marks <= 50){
			System.out.println("The Grade is F");
		}

}
}
