package task9;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ques6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float price = 0;
		
		Scanner input  = new Scanner(System.in);
		System.out.println("Enter the Month : ");
		int month = input.nextInt();
		System.out.println("Enter the Rent/day : ");
		float rent = input.nextFloat();
		System.out.println("Enter the Number of days : ");
		int days = input.nextInt();
		
		switch (month){
		case 1,2,3,5,7,8,9,10:{
			price  = rent * days;
			System.out.print("The hotel Tariff = ");
			break;
			}
		case 4,6,11,12:{
			price = days * (rent*120/100);
			System.out.print("The hotel Tariff = ");
			break;
		}
			
		}
		DecimalFormat objDF = new DecimalFormat("0.00");
		System.out.print(objDF.format(price));
		

	}

}
