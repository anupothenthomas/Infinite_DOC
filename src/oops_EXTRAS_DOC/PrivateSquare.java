package oops_EXTRAS_DOC;

import java.util.Scanner;

public class PrivateSquare {

	public static void main(String[] args) 
	{
		PrivateSquare obj = new PrivateSquare();
		System.out.println("Enter the number whose square you wish to find:\n");
		Scanner ns = new Scanner(System.in);
		
		int n = ns.nextInt();
		
		System.out.println("The square of " +n+ " is: "+obj.square(n));
		
		// TODO Auto-generated method stub
	}


	private int square(int a)
	{
		return a*a;
	}


}