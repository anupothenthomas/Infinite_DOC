package testprogs;

import java.util.Scanner;

public class Factorial 
{
	public static void main(String args[])
	{
		System.out.println("Enter the number to find factorial");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int i =1;
		int temp=1;
		
		while(i<=num)
		{
			temp = temp*i;
			i++;
		}
		System.out.println(temp);
	}
	

}
