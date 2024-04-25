package task9;

import java.util.Scanner;
public class Ques1 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		int i;
		String S2 = "";

		System.out.println("Enter the Word");
		Scanner input = new Scanner(System.in);
		String S1 = input.next();
		for(i=S1.length()-1;i>=0;i--)
		{
			S2 = S2+S1.charAt(i);
		}
		if (S1.equals(S2))
		{
			System.out.println("The Given String is a Pallindrome");
		}else 
		{
			System.out.println("The Given String is NOT a Pallindrome");
		}

	}
}
