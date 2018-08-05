package oops_EXTRAS_DOC;

import java.util.Scanner;

public class PublicTest extends PublicAdd {

	public static void main(String[] args) 
	{
		
		Scanner ne = new Scanner(System.in);
		System.out.println("Enter the numbers to be added: \n");
		int x = ne.nextInt();
		int y = ne.nextInt();
		
		PublicAdd obj = new PublicAdd();
		
		System.out.println("The answer is: " + obj.add(x, y));
		// TODO Auto-generated method stub

	}

}
