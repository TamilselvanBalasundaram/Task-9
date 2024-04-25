package task9;

import java.util.Scanner;

public class Ques3
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		int i,j;
		int num = 1;
		System.out.print("Enter the number : ");
		Scanner Row = new Scanner(System.in);
		int R = Row.nextInt();
		
		for (i=1 ; i<=R ; i++) 
		{
			for(j=1 ; j<=i ; j++)
			{
				System.out.print(num);
				num++;
			}
			System.out.println();
		}
	
		}
}