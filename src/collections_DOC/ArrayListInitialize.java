package collections_DOC;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListInitialize 
{
	public static void main(String args[])
	{
		ArrayList<Integer> arlist = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4 , 5));
		
		System.out.println("The Initialized List: " +arlist);
		
		
		arlist.remove(3);
		System.out.println("The Initialized List: " +arlist);

		
		ArrayList<String> cities = new ArrayList<String>() {{ add("Rohini");
		add("Baghdad"); }};
		System.out.println("The cities" +cities);
		}
	

}
