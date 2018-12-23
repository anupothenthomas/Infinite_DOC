package testprogs;

import java.util.Scanner;

public class CheckPrimeYayNay 
{
	public static void main(String[] args)
	{
		int temp;
		boolean isPrime = true;
		int i, j, num;
		
		System.out.println("Enter the number you wanna check ");
		Scanner scan = new Scanner(System.in);
		
		num = scan.nextInt();
		
		for(i=2; i<num/2; i++)
		{
			temp = num%i;
			if(temp==0)
			{
				isPrime = false;
				break;
				
			}
		}
		if(isPrime)
		{
			System.out.println("The number you entered is Prime");
		}
		else
		{
			System.out.println("The number you entered isn't prime");
		}
	}

}
