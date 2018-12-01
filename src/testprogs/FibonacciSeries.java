package testprogs;

import java.util.Scanner;

public class FibonacciSeries 
{
	public static void main(String args[])
	{
		System.out.println("Enter the limit");
		Scanner sc = new Scanner(System.in);
		int n1 = 0;
		int n2 = 1;
		
		int num = sc.nextInt();
	
		
		
		for(int i = 1; i<num; i++ )
		{
			System.out.println("The series is" +n1);
			int temp = n1+n2;
			n1=n2;
			n2 = temp;
			
			
		}
	}

}
