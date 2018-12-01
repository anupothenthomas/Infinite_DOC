package testprogs;

import java.util.Scanner;

public class PalindromeCheck 
{
	public static boolean isPal(String str)
	{
		if(str.length()==0 || str.length()==1)
			return true;
		if(str.charAt(0) == str.charAt(str.length()-1))
				return isPal(str.substring(1, str.length()-1));
		
		return false;
	}
	
	public static void main(String[] args)
	{
		System.out.println("Enter the string you wanna convert into palindrome");
		
		Scanner sc = new Scanner(System.in);
		String strong = sc.nextLine();
		
		if(isPal(strong) == true)
		{
			System.out.println("This is palindrome");
		}
		else
		{
			System.out.println("This is not a palindrome");
		}
	}

}
