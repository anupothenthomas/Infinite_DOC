package oops_EXTRAS_DOC;

import java.util.Scanner;

public class ProtectedTest 
{
	public static void main(String[] args)
	{
		Scanner n = new Scanner(System.in);
		System.out.println("Enter the two numbers to be added:\n");
		int a= n.nextInt();
		int b= n.nextInt();
		
		ProtectedAdd obj = new ProtectedAdd();
		System.out.println("The result is: " +obj.addNumbers(a, b));
	}

}
