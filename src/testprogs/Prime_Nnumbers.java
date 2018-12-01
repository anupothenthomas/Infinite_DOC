package testprogs;

import java.util.Scanner;

public class Prime_Nnumbers {

	public static void main(String[] args) 
	{
		int num = 3;
		int status= 1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number upto which you want to find prime numbers:\n");
		int number = sc.nextInt();
		
		if (number >= 1)
		{
			System.out.println("The first " +number+ " prime numbers are");
			System.out.println(2);
		}
		
		for(int i=2; i<=number; )
		{
			for(int j=2; j<=Math.sqrt(num); j++)
			{
				if(num%j==0)
				{
					status = 0;
					break;
				}
			}
			if(status!=0)
			{
				System.out.println(num);
				i++;
				
			}
			status= 1;
			num++;
		}
		// TODO Auto-generated method stub

	}

}
