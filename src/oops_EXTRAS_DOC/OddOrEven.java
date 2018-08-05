package oops_EXTRAS_DOC;

import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number which you wanna check for odd'n'even:\n");
		
		int num = sc.nextInt();
		
		if(num%2==0)
		{
			System.out.println("The number " +num+ " is an even number");
		}
		else
		{
			System.out.println("The number " +num+ " is an odd number");
		}
		

	}

}
