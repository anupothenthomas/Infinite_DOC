package testprogs;

import java.util.Scanner;

public class average 
{
	public static void main(String args[])
	{
		
//	double array[] = {10, 11, 2, 3, 5};
//	double total = 0;
//	
//	for (int i=0; i<array.length; i++)
//	{
//		total = total + array[i];
//	}
//	double average = total /array.length;
//	System.out.format("The average is %.3f", average);
		
		
		/*--------------------------------*/
//		System.out.println("Enter the number of rows upto which you want the pyramid");
//		Scanner sc = new Scanner(System.in);
//		
//		int n = sc.nextInt();
//		
//		for(int i =0; i< n; i++)
//		{
//			for(int j=0; j<=i; j++)
//			{
//				System.out.print("* ");
//			}
//            System.out.println(); 
//
//		}
		/*--------------------------------*/

		System.out.println("Enter the number of the rows upto which you wish to have the pyramid printed");
		Scanner sc = new Scanner(System.in);
		
		int rows = sc.nextInt();
		
		for (int i= 1 ; i<=rows; i++)
		{
			for(int j=rows; j>=i; j--)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++)
			{	
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
}
