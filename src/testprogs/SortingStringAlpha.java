package testprogs;

import java.util.Scanner;

public class SortingStringAlpha 
{
	public static void main(String args[])
	{
		
	int count;
	String	 temp;
	Scanner in = new Scanner(System.in);
	
	//User will be asked to enter the number of strings for comparison
	System.out.println("Enter the number of strings you wish to insert");
	count = in.nextInt();
	
	String str[] = new String[count];
	Scanner scan2 = new Scanner(System.in);
	
	//Entering the strings that need to be sorted
	System.out.println("Enter the strings according to the number:");
	for(int i=0; i<count; i++)
	{
		str[i] = scan2.nextLine();
	}
	
	in.close();
	scan2.close();
	
	//sorting the strings
	for (int i = 0; i < count; i++) 
    {
        for (int j = i + 1; j < count; j++) { 
            if (str[i].compareTo(str[j])>0) 
            {
                temp = str[i];
                str[i] = str[j];
                str[j] = temp;
            }
        }
    }
	
	 //Displaying the strings after sorting them based on alphabetical order
    System.out.print("Strings in Sorted Order:");
    for (int i = 0; i <= count - 1; i++) 
    {
        System.out.print(str[i] + ", ");
    }
	

	}
}
