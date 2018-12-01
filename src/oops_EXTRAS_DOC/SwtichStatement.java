package oops_EXTRAS_DOC;

import java.util.Scanner;

public class SwtichStatement
{
	public static void main(String args[]) throws InterruptedException
	{
		Scanner sys= new Scanner(System.in);
		System.out.println("Enter the first operand and second operand simultaneously");
		int l = sys.nextInt();
		int m = sys.nextInt();
		
		System.out.println("The numbers entered are " +l+ " & " +m+ "\n");
		Thread.sleep(500);
		
		System.out.println("Enter the digit you wanna perform operation");
		System.out.println("Type add for addition: ");
		System.out.println("Type sub for subtraction: ");
		System.out.println("Type div for division: ");
		System.out.println("Type mul for multiplication: ");

		String a = sys.next();
		
		System.out.println("You have selected " +a+ " as your operation choice");
		Thread.sleep(1000);
		System.out.println("The result of the operation on operands is:\n");
		
		switch(a)
		{
		case "add":
			System.out.println(l+m);
			break;
			
		case "sub":
			System.out.println(l-m);
			break;
			
		case "div": 
			System.out.println(l/m);
			break;
			
		case "mul":
			System.out.println(l*m);
			break;
			
			default: 
				System.out.println("You have some stupid input...!!");
				break;
		}
	}
}
